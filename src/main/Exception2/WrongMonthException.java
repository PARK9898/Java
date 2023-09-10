package main.Exception2;


// RuntimeException 상속 받지 않음
public class WrongMonthException extends Exception {
	public WrongMonthException(String message) {
		super(message);
	}

	public WrongMonthException(String message, Throwable cause) {
		super(message, cause);
	}
}
