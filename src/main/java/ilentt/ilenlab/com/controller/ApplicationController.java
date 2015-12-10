package ilentt.ilenlab.com.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller
public class ApplicationController {
    @Bean
    public OrdersController ordersController() {
        return new OrdersController();
    }
}
