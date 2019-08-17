package com.demo.ecommerce.domain;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table; 

@Entity
@Table(name = "UserOrder")
public class UserOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userOrderId")
	private Long userOrderId;
	
	@Column(name = "totalPrice",nullable=false)
	private BigDecimal totalPrice;
	
	@ManyToMany(cascade=CascadeType.ALL)  
    @JoinTable(name="order_product", joinColumns=@JoinColumn(name="userOrderId"), inverseJoinColumns=@JoinColumn(name="productId"))
	private Set<Product> products;
	
	@Column(name = "discount",nullable=false)
	private BigDecimal discount;
	
	@Column(name = "orderStatus")
	private Integer orderStatus;
	
	@OneToMany(
	          mappedBy = "shipment",
	          cascade = CascadeType.ALL,
	          orphanRemoval = true
	      )
	      private Set<Shipment> shipments = new HashSet<>();

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="userId", referencedColumnName="userId")
	    private User user;
	
	public Long getOrderId() {
		return userOrderId;
	}

	public void setOrderId(Long userOrderId) {
		this.userOrderId = userOrderId;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	
	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	
	
	
	
	

}
