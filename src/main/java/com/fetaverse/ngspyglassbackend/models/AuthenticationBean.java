package com.fetaverse.ngspyglassbackend.models;

public class AuthenticationBean {
    private String message;

    public AuthenticationBean() {
    }

    public AuthenticationBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AuthenticationBean)) return false;

        AuthenticationBean that = (AuthenticationBean) o;

        return getMessage().equals(that.getMessage());
    }

    @Override
    public int hashCode() {
        return getMessage().hashCode();
    }

    @Override
    public String toString() {
        return "AuthenticationBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
