package com.SpringbootWeek2Ass.week2ass.advice;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ApiResponse<T> {
    @JsonFormat(pattern = "hh:mm:ss DD-MM-YYYY")
    private LocalDateTime timeStamp;

    private T data;

    private ApiError error;

    public ApiResponse() {
        this.timeStamp=LocalDateTime.now();
    }

    public ApiResponse(T data) {
        this();
        this.data = data;
    }

    public ApiResponse(ApiError error) {
        this();
        this.error = error;
    }
}
