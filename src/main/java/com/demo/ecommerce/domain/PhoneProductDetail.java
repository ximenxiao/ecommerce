package com.demo.ecommerce.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "phone product detail")
public class PhoneProductDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "phoneProductId")
	private Long phoneProductId;
	
	@Column(name = "wirelessCarrier")
	private String wirelessCarrier;
	
	@Column (name = "productCondition")
	private String productCondition;
	
	@Column (name = "memory")
	private Integer memory;
	
	@Column (name = "ramSize")
	private Integer ramSize;
	
	@Column (name = "status")
	private Integer status;
	
	@Column (name = "sellerId")
	private Integer sellerId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPhoneProductId() {
		return phoneProductId;
	}

	public void setPhoneProductId(Long phoneProductId) {
		this.phoneProductId = phoneProductId;
	}

	public String getWirelessCarrier() {
		return wirelessCarrier;
	}

	public void setWirelessCarrier(String wirelessCarrier) {
		this.wirelessCarrier = wirelessCarrier;
	}

	public String getProductCondition() {
		return productCondition;
	}

	public void setProductCondition(String productCondition) {
		this.productCondition = productCondition;
	}

	public Integer getMemory() {
		return memory;
	}

	public void setMemory(Integer memory) {
		this.memory = memory;
	}

	public Integer getRamSize() {
		return ramSize;
	}

	public void setRamSize(Integer ramSize) {
		this.ramSize = ramSize;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getSellerId() {
		return sellerId;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((memory == null) ? 0 : memory.hashCode());
		result = prime * result + ((phoneProductId == null) ? 0 : phoneProductId.hashCode());
		result = prime * result + ((productCondition == null) ? 0 : productCondition.hashCode());
		result = prime * result + ((ramSize == null) ? 0 : ramSize.hashCode());
		result = prime * result + ((sellerId == null) ? 0 : sellerId.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((wirelessCarrier == null) ? 0 : wirelessCarrier.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhoneProductDetail other = (PhoneProductDetail) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (memory == null) {
			if (other.memory != null)
				return false;
		} else if (!memory.equals(other.memory))
			return false;
		if (phoneProductId == null) {
			if (other.phoneProductId != null)
				return false;
		} else if (!phoneProductId.equals(other.phoneProductId))
			return false;
		if (productCondition == null) {
			if (other.productCondition != null)
				return false;
		} else if (!productCondition.equals(other.productCondition))
			return false;
		if (ramSize == null) {
			if (other.ramSize != null)
				return false;
		} else if (!ramSize.equals(other.ramSize))
			return false;
		if (sellerId == null) {
			if (other.sellerId != null)
				return false;
		} else if (!sellerId.equals(other.sellerId))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (wirelessCarrier == null) {
			if (other.wirelessCarrier != null)
				return false;
		} else if (!wirelessCarrier.equals(other.wirelessCarrier))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PhoneProductDetail [id=" + id + ", phoneProductId=" + phoneProductId + ", wirelessCarrier="
				+ wirelessCarrier + ", productCondition=" + productCondition + ", memory=" + memory + ", ramSize="
				+ ramSize + ", status=" + status + ", sellerId=" + sellerId + "]";
	}
	

	
}
