package ilentt.ilenlab.com.service;

import java.util.List;

import ilentt.ilenlab.com.dom.Orders;
import ilentt.ilenlab.com.exception.OrdersNotFound;

public interface IOrdersService {
    public Orders createOrders(Orders orders);

    public Orders updateOrders(Orders orders) throws OrdersNotFound;

    public Orders deleteOrders(Orders orders) throws OrdersNotFound;

    public Orders findById(Long id);

    public Orders findByJobTitle(String jobTitle);

    public List<Orders> findAllOrders();

    public void deleteAllOrders();

    public boolean isOrdersExits(Orders orders);
}
