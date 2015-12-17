package ilentt.ilenlab.com.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ilentt.ilenlab.com.service.IDummyDataService;

@Controller
public class ApplicationController {
    @Value("${application.message}")
    private String message;
    @Autowired
    private IDummyDataService dummyDataService;

    @RequestMapping("/")
            ModelAndView main() {
        dummyDataService.setupOrders();
        Map<String, Object> model = new HashMap<String, Object>() {
            private static final long serialVersionUID = -6883088231537577238L;

            {
                put("message", String.format(message, ""));
            }
        };
        return new ModelAndView("index", model);
    }

    @Bean
    public OrdersController ordersController() {
        // call OrdersController
        return new OrdersController();
    }
}
