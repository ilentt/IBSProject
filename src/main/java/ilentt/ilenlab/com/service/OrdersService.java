package ilentt.ilenlab.com.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ilentt.ilenlab.com.dao.IOrdersRepository;
import ilentt.ilenlab.com.dom.Orders;
import ilentt.ilenlab.com.exception.OrdersNotFound;

@Service
public class OrdersService implements IOrdersService {
    @Autowired
    private IOrdersRepository orderRespository;

    @Override
    @Transactional
    public Orders createOrders(Orders orders) {
        // TODO Auto-generated method stub
        return orderRespository.save(orders);
    }

    @Override
    public Orders updateOrders(Orders orders) throws OrdersNotFound {
        // TODO Auto-generated method stub
        Optional<Orders> ord = Optional.ofNullable(orderRespository.findOne(orders.getOrderID()));
        if (!ord.isPresent()) {
            throw new OrdersNotFound(String.format("Order %s does not exist.", ord.get().getOrderID()));
        }
        ord.get().setJobTitle(orders.getJobTitle());
        return ord.get();
    }

    @Override
    @Transactional(rollbackOn = OrdersNotFound.class)
    public Orders deleteOrders(Orders orders) throws OrdersNotFound {
        // TODO Auto-generated method stub
        Optional<Orders> ord = Optional.ofNullable(orderRespository.findOne(orders.getOrderID()));
        if (!ord.isPresent()) {
            throw new OrdersNotFound(String.format("Order %s does not exist.", ord.get().getOrderID()));
        }
        orderRespository.delete(ord.get());
        return ord.get();
    }

    @Override
    public Orders findById(Long id) {
        // TODO Auto-generated method stub
        return orderRespository.findOne(id);
    }

    @Override
    public Orders findByJobTitle(String jobTitle) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Orders> findAllOrders() {
        // TODO Auto-generated method stub
        return orderRespository.findAll();
    }

    @Override
    public void deleteAllOrders() {
        // TODO Auto-generated method stub
    }

    @Override
    public boolean isOrdersExits(Orders orders) {
        // TODO Auto-generated method stub
        return false;
    }
}
