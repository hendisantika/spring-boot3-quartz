package com.hendisantika.springboot3quartz.exception.base;

import com.hendisantika.springboot3quartz.exception.DataNotFoundException;
import com.hendisantika.springboot3quartz.exception.DuplicateException;
import com.hendisantika.springboot3quartz.exception.UnauthorizedException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot3-quartz
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/13/23
 * Time: 07:39
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@RestControllerAdvice
public class BaseControllerAdvice {

    public static final Timestamp TIMESTAMP = new Timestamp(System.currentTimeMillis());

    @ExceptionHandler({NoHandlerFoundException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse noHandlerFoundException(NoHandlerFoundException ex) {
        log.debug(ex.getMessage(), ex.getCause());
        return new ErrorResponse(
                String.valueOf(HttpStatus.NOT_FOUND.value()),
                "No resource found for your request. Please verify you request",
                TIMESTAMP);
    }

    @ExceptionHandler({DataNotFoundException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse dataNotFoundException(Exception ex) {
        log.debug(ex.getMessage(), ex.getCause());
        return new ErrorResponse(
                String.valueOf(HttpStatus.NOT_FOUND.value()), ex.getMessage(), TIMESTAMP);
    }

    @ExceptionHandler({BadRequestException.class, DuplicateException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleBadRequestException(Exception ex) {
        return new ErrorResponse(
                String.valueOf(HttpStatus.BAD_REQUEST.value()), ex.getMessage(), TIMESTAMP);
    }

    @ExceptionHandler({UnauthorizedException.class})
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ErrorResponse handleUnauthorizedException(Exception ex) {
        return new ErrorResponse(
                String.valueOf(HttpStatus.UNAUTHORIZED.value()), ex.getMessage(), TIMESTAMP);
    }
}
