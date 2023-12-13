package com.hendisantika.springboot3quartz.exception;

import org.hibernate.service.spi.ServiceException;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot3-quartz
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/13/23
 * Time: 07:38
 * To change this template use File | Settings | File Templates.
 */
public class TooManyRequestsException extends ServiceException {

    public TooManyRequestsException() {
        super();
    }

    public TooManyRequestsException(String message) {
        super(message);
    }

    public TooManyRequestsException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
