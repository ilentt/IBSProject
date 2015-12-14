package ilentt.ilenlab.com.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/orders")
public class OrdersController {
    @Value("${application.message}")
    private String message;

    // @Autowired
    // private OrdersService orderService;
    /*
     * @Autowired private IDummyDataService dummyDataService;
     */
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getOrders() {
        // dummyDataService.setupOrders();
        // List<Orders> orders = orderService.findAllOrders();
        // return new ModelAndView("orders-list", "orders", orders);
        return null;
    }
    /*
     * @RequestMapping(params = "/create", method = RequestMethod.POST) public String createOrders(@Valid Orders order,
     * BindingResult result, SessionStatus status, RedirectAttributes redirect) { if (result.hasErrors()) { return
     * "order-edit"; } Orders orders = orderService.createOrders(order); status.setComplete();
     * redirect.addFlashAttribute("msg", String.format("Order '%s' added successfuly", orders.getOrderID())); return
     * "redirect:orders/" + orders.getOrderID(); }
     */
}
