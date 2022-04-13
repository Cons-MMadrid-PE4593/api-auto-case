package com.santander.connector.handler;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

public class ResponseError {
	
	@JsonProperty("debugMessage")
	private String debugMessage = null;

	@JsonProperty("message")
	private String message = null;

	@JsonProperty("status")
	private StatusEnum status = null;

	@JsonProperty("subErrors")
	@Valid
	private List<String> subErrors = null;

	@JsonProperty("timestamp")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private LocalDateTime timestamp = null;
	
	private ResponseError() {
        timestamp = LocalDateTime.now();
    }

	public ResponseError(StatusEnum status) {
		this();
		this.status = status;
	}
    
	public ResponseError(StatusEnum status, String message, Throwable ex) {
		this();
        this.status = status;
        this.message = message;
        this.debugMessage = ex.getLocalizedMessage();
    }

	/**
	 * Gets or Sets status
	 */
	public enum StatusEnum {
		_100_CONTINUE("100 CONTINUE"),

		_101_SWITCHING_PROTOCOLS("101 SWITCHING_PROTOCOLS"),

		_102_PROCESSING("102 PROCESSING"),

		_103_CHECKPOINT("103 CHECKPOINT"),

		_200_OK("OK"),

		_201_CREATED("201 CREATED"),

		_202_ACCEPTED("202 ACCEPTED"),

		_203_NON_AUTHORITATIVE_INFORMATION("203 NON_AUTHORITATIVE_INFORMATION"),

		_204_NO_CONTENT("204 NO_CONTENT"),

		_205_RESET_CONTENT("205 RESET_CONTENT"),

		_206_PARTIAL_CONTENT("206 PARTIAL_CONTENT"),

		_207_MULTI_STATUS("207 MULTI_STATUS"),

		_208_ALREADY_REPORTED("208 ALREADY_REPORTED"),

		_226_IM_USED("226 IM_USED"),

		_300_MULTIPLE_CHOICES("300 MULTIPLE_CHOICES"),

		_301_MOVED_PERMANENTLY("301 MOVED_PERMANENTLY"),

		_302_FOUND("302 FOUND"),

		_302_MOVED_TEMPORARILY("302 MOVED_TEMPORARILY"),

		_303_SEE_OTHER("303 SEE_OTHER"),

		_304_NOT_MODIFIED("304 NOT_MODIFIED"),

		_305_USE_PROXY("305 USE_PROXY"),

		_307_TEMPORARY_REDIRECT("307 TEMPORARY_REDIRECT"),

		_308_PERMANENT_REDIRECT("308 PERMANENT_REDIRECT"),

		_400_BAD_REQUEST("BAD_REQUEST"),

		_401_UNAUTHORIZED("401 UNAUTHORIZED"),

		_402_PAYMENT_REQUIRED("402 PAYMENT_REQUIRED"),

		_403_FORBIDDEN("403 FORBIDDEN"),

		_404_NOT_FOUND("404 NOT_FOUND"),

		_405_METHOD_NOT_ALLOWED("METHOD_NOT_ALLOWED"),

		_406_NOT_ACCEPTABLE("NOT_ACCEPTABLE"),

		_407_PROXY_AUTHENTICATION_REQUIRED("407 PROXY_AUTHENTICATION_REQUIRED"),

		_408_REQUEST_TIMEOUT("408 REQUEST_TIMEOUT"),

		_409_CONFLICT("409 CONFLICT"),

		_410_GONE("410 GONE"),

		_411_LENGTH_REQUIRED("411 LENGTH_REQUIRED"),

		_412_PRECONDITION_FAILED("412 PRECONDITION_FAILED"),

		_413_PAYLOAD_TOO_LARGE("413 PAYLOAD_TOO_LARGE"),

		_413_REQUEST_ENTITY_TOO_LARGE("413 REQUEST_ENTITY_TOO_LARGE"),

		_414_URI_TOO_LONG("414 URI_TOO_LONG"),

		_414_REQUEST_URI_TOO_LONG("414 REQUEST_URI_TOO_LONG"),

		_415_UNSUPPORTED_MEDIA_TYPE("UNSUPPORTED_MEDIA_TYPE"),

		_416_REQUESTED_RANGE_NOT_SATISFIABLE("416 REQUESTED_RANGE_NOT_SATISFIABLE"),

		_417_EXPECTATION_FAILED("417 EXPECTATION_FAILED"),

		_418_I_AM_A_TEAPOT("418 I_AM_A_TEAPOT"),

		_419_INSUFFICIENT_SPACE_ON_RESOURCE("419 INSUFFICIENT_SPACE_ON_RESOURCE"),

		_420_METHOD_FAILURE("420 METHOD_FAILURE"),

		_421_DESTINATION_LOCKED("421 DESTINATION_LOCKED"),

		_422_UNPROCESSABLE_ENTITY("422 UNPROCESSABLE_ENTITY"),

		_423_LOCKED("423 LOCKED"),

		_424_FAILED_DEPENDENCY("424 FAILED_DEPENDENCY"),

		_425_TOO_EARLY("425 TOO_EARLY"),

		_426_UPGRADE_REQUIRED("426 UPGRADE_REQUIRED"),

		_428_PRECONDITION_REQUIRED("428 PRECONDITION_REQUIRED"),

		_429_TOO_MANY_REQUESTS("429 TOO_MANY_REQUESTS"),

		_431_REQUEST_HEADER_FIELDS_TOO_LARGE("431 REQUEST_HEADER_FIELDS_TOO_LARGE"),

		_451_UNAVAILABLE_FOR_LEGAL_REASONS("451 UNAVAILABLE_FOR_LEGAL_REASONS"),

		_500_INTERNAL_SERVER_ERROR("INTERNAL_SERVER_ERROR"),

		_501_NOT_IMPLEMENTED("501 NOT_IMPLEMENTED"),

		_502_BAD_GATEWAY("502 BAD_GATEWAY"),

		_503_SERVICE_UNAVAILABLE("503 SERVICE_UNAVAILABLE"),

		_504_GATEWAY_TIMEOUT("504 GATEWAY_TIMEOUT"),

		_505_HTTP_VERSION_NOT_SUPPORTED("505 HTTP_VERSION_NOT_SUPPORTED"),

		_506_VARIANT_ALSO_NEGOTIATES("506 VARIANT_ALSO_NEGOTIATES"),

		_507_INSUFFICIENT_STORAGE("507 INSUFFICIENT_STORAGE"),

		_508_LOOP_DETECTED("508 LOOP_DETECTED"),

		_509_BANDWIDTH_LIMIT_EXCEEDED("509 BANDWIDTH_LIMIT_EXCEEDED"),

		_510_NOT_EXTENDED("510 NOT_EXTENDED"),

		_511_NETWORK_AUTHENTICATION_REQUIRED("511 NETWORK_AUTHENTICATION_REQUIRED");

		private String value;

		StatusEnum(String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static StatusEnum fromValue(String text) {
			for (StatusEnum b : StatusEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	public ResponseError debugMessage(String debugMessage) {
		this.debugMessage = debugMessage;
		return this;
	}

	/**
	 * Get debugMessage
	 * 
	 * @return debugMessage
	 **/
	@ApiModelProperty(value = "")

	public String getDebugMessage() {
		return debugMessage;
	}

	public void setDebugMessage(String debugMessage) {
		this.debugMessage = debugMessage;
	}

	public ResponseError message(String message) {
		this.message = message;
		return this;
	}

	/**
	 * Get message
	 * 
	 * @return message
	 **/
	@ApiModelProperty(value = "")

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ResponseError status(StatusEnum status) {
		this.status = status;
		return this;
	}

	/**
	 * Get status
	 * 
	 * @return status
	 **/
	@ApiModelProperty(value = "")

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public ResponseError subErrors(List<String> subErrors) {
		this.subErrors = subErrors;
		return this;
	}

	public ResponseError addSubErrorsItem(String subErrorsItem) {
		if (this.subErrors == null) {
			this.subErrors = new ArrayList<String>();
		}
		this.subErrors.add(subErrorsItem);
		return this;
	}

	/**
	 * Get subErrors
	 * 
	 * @return subErrors
	 **/
	@ApiModelProperty(value = "")

	public List<String> getSubErrors() {
		return subErrors;
	}

	public void setSubErrors(List<String> subErrors) {
		this.subErrors = subErrors;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ResponseError responseError_ = (ResponseError) o;
		return Objects.equals(this.debugMessage, responseError_.debugMessage)
				&& Objects.equals(this.message, responseError_.message)
				&& Objects.equals(this.status, responseError_.status)
				&& Objects.equals(this.subErrors, responseError_.subErrors)
				&& Objects.equals(this.timestamp, responseError_.timestamp);
	}

	@Override
	public int hashCode() {
		return Objects.hash(debugMessage, message, status, subErrors, timestamp);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ResponseError {\n");

		sb.append("    debugMessage: ").append(toIndentedString(debugMessage)).append("\n");
		sb.append("    message: ").append(toIndentedString(message)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    subErrors: ").append(toIndentedString(subErrors)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

    public void addValidationObjectErrors(List<ObjectError> globalErrors) {
        globalErrors.forEach(this::addValidationError);
    }

    private void addValidationError(ObjectError objectError) {
        this.addValidationError(
                objectError.getObjectName(),
                objectError.getDefaultMessage());
    }

    private void addValidationError(String object, String message) {
        addSubError(new ResponseValidationError(object, message));
    }

	
	public void addValidationFieldErrors(List<FieldError> fieldErrors) {
        fieldErrors.forEach(this::addValidationError);
    }
	
	private void addValidationError(FieldError fieldError) {
        this.addValidationError(
                fieldError.getObjectName(),
                fieldError.getField(),
                fieldError.getRejectedValue(),
                fieldError.getDefaultMessage());
    }
	
	private void addValidationError(String object, String field, Object rejectedValue, String message) {
        addSubError(new ResponseValidationError(object, field, rejectedValue, message));
    }

    private void addSubError(Error subError) {
        if (subErrors == null) {
            subErrors = new ArrayList<>();
        }
        subErrors.add(subError.getMessage());
    }

}