package com.markrai.departments.configuration;

//  This class is my custom exception which could be used to handle validation exceptions
//  which are then displayed on a future UI


public class ManagedError extends Exception {

	private static final long serialVersionUID = 1L;

	public static final int ERROR = 0, WARNING = 1, SUCCESS = 2;

	private int code;

	private String message, errorHeader;

	private Object data;

	private int type = ERROR;

	public ManagedError(String errorHeader, String message) {
		this.message = message;
		this.errorHeader = errorHeader;
	}

	public ManagedError(String errorHeader, String message, int code) {
		this.message = message;
		this.errorHeader = errorHeader;
		this.code = code;
	}

	public ManagedError(String errorHeader, String message, int code, int type) {
		this.message = message;
		this.errorHeader = errorHeader;
		this.code = code;
		this.type = type;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrorHeader() {
		return errorHeader;
	}

	public void setErrorHeader(String errorHeader) {
		this.errorHeader = errorHeader;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
