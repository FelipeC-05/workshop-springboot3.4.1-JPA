package com.estudandospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandospring.course.entities.OrderItem;
import com.estudandospring.course.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
