package com.cls.avengers.exceptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Calendar;

@Schema
public record ErrorResponse(
        @Schema(description = "Thời gian xảy ra lỗi (Epoch milliseconds)")
        @JsonProperty("timestamp")
        long timestamp,

        @Schema(description = "Đường dẫn")
        @JsonProperty("path")
        String path,

        @Schema(description = "Http status")
        @JsonProperty("status")
        int status,

        @Schema(description = "Loại lỗi")
        @JsonProperty("error")
        String error,

        @Schema(description = "Mã lỗi")
        @JsonProperty("error_code")
        String errorCode,

        @Schema(description = "Nội dung lỗi")
        @JsonProperty("error_description")
        String errorDescription
) {
    /**
     * Creates a {@link ErrorResponse} instance content.
     *
     * @param path             path
     * @param status           status
     * @param error            error
     * @param errorCode        error code
     * @param errorDescription error description
     */
    public ErrorResponse(String path,
                         int status,
                         String error,
                         String errorCode,
                         String errorDescription) {
        this(
                Calendar.getInstance().getTimeInMillis(),
                path,
                status,
                error,
                errorCode,
                errorDescription
        );
    }
}
