package com.kbtg.bootcamp.product.response;

public class ApiResponse {

    private String message;

    public ApiResponse(String formatted) {
        this.message = formatted;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
