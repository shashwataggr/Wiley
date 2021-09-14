package com.shashwat.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shashwat.entity.OrderDetails;

@Repository
public interface OrderRepo extends JpaRepository<OrderDetails, Long> {

}
