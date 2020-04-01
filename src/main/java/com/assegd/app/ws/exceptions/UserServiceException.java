package com.assegd.app.ws.exceptions;

public class UserServiceException extends RuntimeException {

    private static final long serialVersionUID = -1029624695896894043L;

    public UserServiceException(String message) {
        super(message);
    }
}
