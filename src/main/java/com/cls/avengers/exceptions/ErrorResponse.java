package com.cls.avengers.exceptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ErrorResponse {
    
    /**
     * Error
     */
    @JsonProperty("error")
    private String error;
    
    /**
     * Error code
     */
    @JsonProperty("error_code")
    private String errorCode;
    
    /**
     * Error description
     */
    @JsonProperty("error_description")
    private String errorDescription;
    
    
    /**
     * Creates a {@link ErrorResponse} instance content.
     * @param error error message
     * @param errorDescription error description
     */
    public ErrorResponse(String error, String errorDescription) {
        this.error = error;
        this.errorDescription = errorDescription;
    }
    
    /**
     * Creates a {@link ErrorResponse} instance content.
     * @param error error message
     * @param errorCode error code
     * @param errorDescription error description
     */
    public ErrorResponse(String error, String errorCode, String errorDescription) {
        this.error = error;
        this.errorCode = errorCode;
        this.errorDescription = errorDescription;
    }
}
