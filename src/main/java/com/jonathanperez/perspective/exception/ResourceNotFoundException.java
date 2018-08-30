package com.jonathanperez.perspective.exception;

public class ResourceNotFoundException extends RuntimeException {

	public ResourceNotFoundException() {
	}

	public ResourceNotFoundException(String resourceName, String fieldName, Object fieldValue) {
		super(String.format("%s not found with %s %s", resourceName, fieldName, fieldValue));
	}

}
