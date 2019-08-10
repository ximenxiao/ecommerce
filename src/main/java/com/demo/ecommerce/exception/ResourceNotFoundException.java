package com.demo.ecommerce.exception;

public class ResourceNotFoundException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5475484897705156657L;

	public ResourceNotFoundException(String msg) {
		super(msg);
	}

}
