package com.shashwat.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class OrderEntity {
		@Id
		private Long id;
	    private Long productId;
	    private int quantity;
	    private Double productPrice;
//	    @ManyToOne
//	    @JoinColumn(name="order_id")
//	    private OrderDetails orderDetails;
}
