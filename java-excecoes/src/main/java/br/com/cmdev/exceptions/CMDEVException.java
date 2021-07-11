package br.com.cmdev.exceptions;

//public class CMDEVException extends RuntimeException {
public class CMDEVException extends Exception {

	private static final long serialVersionUID = -550785598327431512L;

	public CMDEVException(String message) {
		super(message);
	}

}
