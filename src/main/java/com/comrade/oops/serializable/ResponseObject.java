package com.comrade.oops.serializable;

public class ResponseObject <T>{
    private T response;

    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }
}
