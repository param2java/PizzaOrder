package com.jrnd.po.service;

import java.util.List;

import com.jrnd.po.entity.ToppingsDO;

public interface ToppingsService {
	String saveToppings(ToppingsDO toppings);
	void deleteToppings(String ToppingsId);
	void updateToppings(ToppingsDO Toppings);
	ToppingsDO getToppingById (String ToppingsId);
	List<ToppingsDO> getAllToppings();
}
