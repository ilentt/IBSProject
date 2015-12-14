package ilentt.ilenlab.com.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ilentt.ilenlab.com.dom.Orders;
import ilentt.ilenlab.com.service.IOrdersService;

@Controller
@RequestMapping(value = "/orders")
@SessionAttributes(types = Orders.class)
public class OrdersController {
    @Autowired
    private IOrdersService orderService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getOrders() {
        List<Orders> orders = orderService.findAllOrders();
        return new ModelAndView("orders-list", "orders", orders);
    }

    @RequestMapping(params = "/create", method = RequestMethod.POST)
    public String createOrders(@Valid Orders order, BindingResult result, SessionStatus status,
            RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return "order-edit";
        }
        Orders orders = orderService.createOrders(order);
        status.setComplete();
        redirect.addFlashAttribute("msg", String.format("Order '%s' added successfuly", orders.getOrderID()));
        return "redirect:orders/" + orders.getOrderID();
    }
}
