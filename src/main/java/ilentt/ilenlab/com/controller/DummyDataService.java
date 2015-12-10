package ilentt.ilenlab.com.controller;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ilentt.ilenlab.com.dao.IOrdersRepository;
import ilentt.ilenlab.com.dom.Orders;
import ilentt.ilenlab.com.service.IDummyDataService;

@Service
public class DummyDataService implements IDummyDataService {
    @PersistenceContext
    private EntityManager em;
    @Autowired
    private IOrdersRepository ordersRepository;

    @Override
    public void setupOrders() {
        // TODO Auto-generated method stub
        if (ordersRepository.count() < 1) {
            Orders o1 = new Orders(new Date(), "Java developer", "Web programing", 10, "2 month", "HRM system",
                    "500 - 700", "1 - 2 years", "HCM", 7, true, new Date());
            Orders o2 = new Orders(new Date(), ".Net developer", "Web programing", 15, "1 month", "IBS system",
                    "400 - 800", "1 - 2 years", "HCM", 5, true, new Date());
            Orders o3 = new Orders(new Date(), ".FrontEnd developer", "Web programing", 12, "1 month", "IBS system",
                    "600 - 700", "1 - 2 years", "HCM", 8, true, new Date());
            ordersRepository.save(o1);
            ordersRepository.save(o2);
            ordersRepository.save(o3);
        }
    }
}
