package com.hendisantika.springboot3quartz.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot3-quartz
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/13/23
 * Time: 07:32
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@RequiredArgsConstructor
public class QuartzConfig {

    private final String QUARTZ_PROPERTIES = "quartz/quartz.properties";
}
