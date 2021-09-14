package com.shashwat.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetails {
	@Id
    private Long id;
    private String customerEmail;
    private String customerAddress;
    @OneToMany(cascade=CascadeType.ALL)
    private List<OrderEntity> items;
}
