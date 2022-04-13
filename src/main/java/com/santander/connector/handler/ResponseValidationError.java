package com.santander.connector.handler;

public class ResponseValidationError extends Error {
	
    private String object;
    private String field;
    private Object rejectedValue;
    private String message;

    public ResponseValidationError(String object, String message) {
        this.object = object;
        this.message = message;
    }

	public ResponseValidationError(String object, String field, Object rejectedValue, String message) {
		super();
		this.object = object;
		this.field = field;
		this.rejectedValue = rejectedValue;
		this.message = message;
	}
    
}
