package com.hendisantika.springboot3quartz.exception;

import org.hibernate.service.spi.ServiceException;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot3-quartz
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/13/23
 * Time: 07:37
 * To change this template use File | Settings | File Templates.
 */
public class DuplicateException extends ServiceException {

    public DuplicateException() {
        super();
    }

    public DuplicateException(String message) {
        super(message);
    }

    public DuplicateException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
