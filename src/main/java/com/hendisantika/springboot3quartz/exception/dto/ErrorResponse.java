package com.hendisantika.springboot3quartz.exception.dto;

import lombok.*;

import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot3-quartz
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/13/23
 * Time: 07:42
 * To change this template use File | Settings | File Templates.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ErrorResponse {

    /** error code */
    private String code;
    /** short error message */
    private String message;

    /** error cause timestamp */
    private Timestamp timestamp;
}
