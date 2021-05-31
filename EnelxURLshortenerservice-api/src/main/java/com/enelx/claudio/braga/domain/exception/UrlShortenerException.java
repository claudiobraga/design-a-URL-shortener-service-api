package com.enelx.claudio.braga.domain.exception;

public class UrlShortenerException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public UrlShortenerException(String message) {
		
		super (message);
	}

}
