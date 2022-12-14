package com.brundelmouro.javastudies.repositories;

import java.util.List;

import com.brundelmouro.javastudies.features.stream.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long> {

	List<Order> findAll();
}
