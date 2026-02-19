package com.JCommerceSystem.J_Commerce.System.repositories;

import com.JCommerceSystem.J_Commerce.System.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
