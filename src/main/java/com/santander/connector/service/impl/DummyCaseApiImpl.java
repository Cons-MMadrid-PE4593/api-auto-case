package com.santander.connector.service.impl;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.santander.connector.service.DummyCaseApi;

@Controller
public class DummyCaseApiImpl  implements DummyCaseApi{
	public ResponseEntity<String> dummyMethod() {
		try {
			String ip = InetAddress.getLocalHost().getHostAddress();
			System.out.println("host-ip " + ip);
		} catch (UnknownHostException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		return new ResponseEntity<String>("Hola mundo",HttpStatus.OK);
	}
}
