package com.hendisantika.springboot3quartz.exception;

import com.hendisantika.springboot3quartz.exception.base.ServiceException;

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
public class ForbiddenException extends ServiceException {

    public ForbiddenException() {
        super();
    }

    public ForbiddenException(String message) {
        super(message);
    }

    public ForbiddenException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
