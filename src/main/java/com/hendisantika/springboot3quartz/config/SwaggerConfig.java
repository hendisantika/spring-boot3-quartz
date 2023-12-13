package com.hendisantika.springboot3quartz.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot3-quartz
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/13/23
 * Time: 07:34
 * To change this template use File | Settings | File Templates.
 */
@Configuration
public class SwaggerConfig implements WebMvcConfigurer {

    private static final String REDIRECT_URL = "/swagger-ui.html";

    @Value("${spring.mvc.servlet.path}")
    private String baseUrl;

}
