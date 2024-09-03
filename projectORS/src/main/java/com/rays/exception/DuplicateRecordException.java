package com.rays.exception;

/**
 * DuplicateRecordException thrown when a duplicate record occurred
 *Hritika Sahu 
 */
public class DuplicateRecordException extends RuntimeException {

	/**
	 * @param msg
	 *            error message
	 */
	public DuplicateRecordException(String msg) {
		super(msg);
	}

}