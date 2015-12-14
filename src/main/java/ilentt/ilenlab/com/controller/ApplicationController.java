package ilentt.ilenlab.com.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationController {
    @Bean
    public OrdersController ordersController() {
        return new OrdersController();
    }
}
