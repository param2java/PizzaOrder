package com.jrnd.po.dao;

import java.util.List;

import com.jrnd.po.entity.PizzaDO;

public interface PizzaDao {

	String savePizza(PizzaDO pizza);
	void deletePizza(String pizzaId);
	void updatePizza(PizzaDO pizza);
	PizzaDO getPizzaById (String pizzaId);
	List<PizzaDO> getAllPizza();
}
