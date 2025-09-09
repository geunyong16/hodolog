package com.hodolog.api.exception;

/**
 * status ->400
 */
public class InvalidRequest extends HodologException {

    public static final String MESSAGE = "잘못된 요청입니다.";
    public InvalidRequest() {
        super(MESSAGE);
    }

    @Override
    public int statusCode() {
        return 400;
    }
}
