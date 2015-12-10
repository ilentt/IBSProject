package ilentt.ilenlab.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.context.support.ResourceBundleMessageSource;

import ilentt.ilenlab.com.controller.ApplicationController;
import ilentt.ilenlab.com.dao.IOrdersRepository;
import ilentt.ilenlab.com.service.IOrdersService;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = { ApplicationLauncher.class, ApplicationController.class, IOrdersService.class,
        IOrdersRepository.class })
@PropertySource({ "classpath:/application.properties", "classpath:/message.properties" })
public class ApplicationLauncher {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationLauncher.class, args);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public static MessageSource messageSource() {
        ResourceBundleMessageSource resourceBundleMessageSource = new ResourceBundleMessageSource();
        resourceBundleMessageSource.setBasename("message");
        return resourceBundleMessageSource;
    }
}