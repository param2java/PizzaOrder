package com.jrnd.po.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PIZZA")
public class PizzaDO {
	@Id
	@Column(name = "Id")
	private String pizzaId;
	@Column(name = "Type")
	private String pizzaType;
	@Column(name = "SMALL_PRICE")
	private float smallPrice;
	@Column(name = "MEDIUM_PRICE")
	private float mediumPrice;
	@Column(name = "LARGE_PRICE")
	private float largePrice;

	public String getPizzaId() {
		return pizzaId;
	}

	public void setPizzaId(String pizzaId) {
		this.pizzaId = pizzaId;
	}

	public String getPizzaType() {
		return pizzaType;
	}

	public void setPizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}

	public float getSmallPrice() {
		return smallPrice;
	}

	public void setSmallPrice(float smallPrice) {
		this.smallPrice = smallPrice;
	}

	public float getMediumPrice() {
		return mediumPrice;
	}

	public void setMediumPrice(float mediumPrice) {
		this.mediumPrice = mediumPrice;
	}

	public float getLargePrice() {
		return largePrice;
	}

	public void setLargePrice(float largePrice) {
		this.largePrice = largePrice;
	}

	public PizzaDO(String pizzaId, String pizzaType, float smallPrice,
			float mediumPrice, float largePrice) {
		this.pizzaId = pizzaId;
		this.pizzaType = pizzaType;
		this.smallPrice = smallPrice;
		this.mediumPrice = mediumPrice;
		this.largePrice = largePrice;
	}

	public PizzaDO() {
	}

	@Override
	public String toString() {
		return "PizzaDO [pizzaId=" + pizzaId + ", pizzaType=" + pizzaType
				+ ", smallPrice=" + smallPrice + ", mediumPrice=" + mediumPrice
				+ ", largePrice=" + largePrice + "]";
	}

}
