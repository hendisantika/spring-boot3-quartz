package com.hendisantika.springboot3quartz.config;

import de.chandre.quartz.spring.AutowiringSpringBeanJobFactory;
import lombok.RequiredArgsConstructor;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import java.io.IOException;

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

    @Bean
    public SchedulerFactoryBean schedulerFactoryBean(
            final @Autowired ApplicationContext applicationContext)
            throws SchedulerException, IOException {

        AutowiringSpringBeanJobFactory jobFactory = new AutowiringSpringBeanJobFactory();
        jobFactory.setApplicationContext(applicationContext);

        StdSchedulerFactory stdSchedulerFactory = new StdSchedulerFactory(QUARTZ_PROPERTIES);

        SchedulerFactoryBean scheduler = new SchedulerFactoryBean();
        scheduler.setSchedulerFactory(stdSchedulerFactory);
        scheduler.setQuartzProperties(this.quartzProperties());
        scheduler.setConfigLocation(new ClassPathResource(QUARTZ_PROPERTIES));
        scheduler.setJobFactory(jobFactory);
        scheduler.setDataSource(this.quartzDataSource());
        scheduler.setWaitForJobsToCompleteOnShutdown(true);
        scheduler.setAutoStartup(true);

        return scheduler;
    }
}
