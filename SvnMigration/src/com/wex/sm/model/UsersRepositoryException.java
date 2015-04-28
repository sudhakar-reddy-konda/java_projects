package com.wex.sm.model;

public class UsersRepositoryException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
    public UsersRepositoryException(String msg, Throwable t) {
        super(msg, t);
    }

    public UsersRepositoryException(String msg) {
        super(msg);
    }
}
