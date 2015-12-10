package ilentt.ilenlab.com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import ilentt.ilenlab.com.dom.Orders;

public interface IOrdersRepository extends JpaRepository<Orders, Long>, QueryDslPredicateExecutor<Orders> {
}
