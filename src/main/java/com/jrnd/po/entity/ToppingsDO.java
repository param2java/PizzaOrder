package com.jrnd.po.entity;

public class ToppingsDO {
	private String toppingsId;
	private String toppingsName;
	private float toppingsPrice;
	public String getToppingsId() {
		return toppingsId;
	}
	public void setToppingsId(String toppingsId) {
		this.toppingsId = toppingsId;
	}
	public String getToppingsName() {
		return toppingsName;
	}
	public void setToppingsName(String toppingsName) {
		this.toppingsName = toppingsName;
	}
	public float getToppingsPrice() {
		return toppingsPrice;
	}
	public void setToppingsPrice(float toppingsPrice) {
		this.toppingsPrice = toppingsPrice;
	}
	public ToppingsDO(String toppingsId, String toppingsName, float toppingsPrice) {
		this.toppingsId = toppingsId;
		this.toppingsName = toppingsName;
		this.toppingsPrice = toppingsPrice;
	}
	public ToppingsDO() {
	}
	@Override
	public String toString() {
		return "Toppings [toppingsId=" + toppingsId + ", toppingsName="
				+ toppingsName + ", toppingsPrice=" + toppingsPrice + "]";
	}
	
	
}
