package com.santander.connector.utils;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

import com.santander.connector.schema.TextFormat;

public final class HtmlUtil {
	public static String getCalculateFinanceTextConditions(List<TextFormat> textFormatList) {
		String html = "";
		TextFormat minSizeTF = textFormatList.stream().min(Comparator.comparing(TextFormat::getSize))
				.orElseThrow(NoSuchElementException::new);
		int minSize = Integer.valueOf(minSizeTF.getSize());
		TextFormat maxSizeTF = textFormatList.stream().max(Comparator.comparing(TextFormat::getSize))
				.orElseThrow(NoSuchElementException::new);
		int maxSize = Integer.valueOf(maxSizeTF.getSize());

		if (textFormatList != null && textFormatList.size() > 0) {
			for (TextFormat item : textFormatList) {
				html = openSpecialsTags(html, minSize, maxSize, item, false, false, false);
				html += item.getAdditionalProperties().get("text");
				html = closeSpecialTags(html, Boolean.parseBoolean(item.getBold()),
						Boolean.parseBoolean(item.getUnderline()),
						(Integer.valueOf(item.getSize()) == maxSize) || Integer.valueOf(item.getSize()) > minSize);
			}
		}
		return html;
	}

	public static String closeSpecialTags(String html, boolean bBold, boolean bUnderLine, boolean bBig) {
		if (bUnderLine) {
			html += Constants.CLOSEUNDERLINE;
		}
		if (bBold) {
			html += Constants.CLOSEBOLD;
		}
		if (bBig) {
			html += Constants.CLOSESTRONG;
		}
		return html;
	}

	public static String openSpecialsTags(String html, int minSize, int maxSize, TextFormat item, boolean bBig, boolean bBold, boolean bUnderLine) {
		
		if (Integer.valueOf(item.getSize()) == maxSize) {
			html += Constants.OPENBIGSTRONG;
			bBig = true;

		} else if (Integer.valueOf(item.getSize()) > minSize) {
			html += Constants.OPENSTRONG;
			bBig = true;
		}
		if (Boolean.parseBoolean(item.getBold())) {
			html += Constants.OPENBOLD;
			bBold = true;
		}
		if (Boolean.parseBoolean(item.getUnderline())) {
			html += Constants.OPENUNDERLINE;
			bUnderLine = true;
		}
		return html;
	}
}
