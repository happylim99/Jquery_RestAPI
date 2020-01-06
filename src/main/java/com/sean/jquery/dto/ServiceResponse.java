package com.sean.jquery.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
public class ServiceResponse<T> {
    private String status;
    private T data;

    public ServiceResponse() {
    }

    public ServiceResponse(String status, T data) {
        this.status = status;
        this.data = data;
    }

}
