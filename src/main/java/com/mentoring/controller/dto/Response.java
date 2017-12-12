package com.mentoring.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.http.HttpStatus;

/**
 * @author ivanovaolyaa
 * @version 12/12/2017
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response {

    private HttpStatus status;

    private String reason;

}
