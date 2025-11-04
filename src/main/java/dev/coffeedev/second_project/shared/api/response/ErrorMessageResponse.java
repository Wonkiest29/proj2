package dev.coffeedev.second_project.shared.api.response;

public class ErrorMessageResponse {

    private String timestamp;
    private String message;

    public ErrorMessageResponse() {
    }

    public ErrorMessageResponse(String timestamp, String message) {
        this.timestamp = timestamp;
        this.message = message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

