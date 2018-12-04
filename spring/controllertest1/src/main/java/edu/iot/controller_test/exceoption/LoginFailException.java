package edu.iot.controller_test.exceoption;

public class LoginFailException extends Exception {
	public LoginFailException() {}
	public LoginFailException(String message) {
		super(message);
	}
}
