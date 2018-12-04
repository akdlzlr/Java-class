package edu.iot.leo.list;

public class ListIndexOutOfBounceException extends RuntimeException {
	public ListIndexOutOfBounceException() {}
	public ListIndexOutOfBounceException(String message) {
		super(message);
	}
}