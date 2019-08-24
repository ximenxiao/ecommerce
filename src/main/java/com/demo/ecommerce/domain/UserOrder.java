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

import com.fasterxml.jackson.annotation.JsonIgnore; 

@Entity(name = "userOrder")
@Table(name = "userOrder")
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
	
	@Column(name = "discount")
	private BigDecimal discount;
	
	@Column(name = "orderStatus")
	private Integer orderStatus;
	
	@OneToMany(
	          mappedBy = "userOrder",
	          cascade = CascadeType.ALL,
	          orphanRemoval = true
	      )
	private Set<Shipment> shipments = new HashSet<>();

	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="userId", referencedColumnName="userId")
	    private User user;
	
	public Long getUserOrderId() {
		return userOrderId;
	}

	public void setUserOrderId(Long userOrderId) {
		this.userOrderId = userOrderId;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	public Set<Shipment> getShipments() {
		return shipments;
	}

	public void setShipments(Set<Shipment> shipments) {
		this.shipments = shipments;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	
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
