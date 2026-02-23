package com.JCommerceSystem.J_Commerce.System.repositories;

import com.JCommerceSystem.J_Commerce.System.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

