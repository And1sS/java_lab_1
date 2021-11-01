package org.and1ss.java_lab_1.framework.web;

public enum ResponseStatus {

    OK(200),
    BAD_REQUEST(400),
    INTERNAL_SERVER_ERROR(500);

    private final int code;

    ResponseStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
