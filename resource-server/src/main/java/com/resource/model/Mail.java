package com.resource.model;

public class Mail {
    private String to;

    private String subject;

    private String message;

    public Mail(String to, String subject, String message) {
        this.to = to;
        this.subject = subject;
        this.message = message;
    }

    public Mail( ) {

    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}