package com.jrnd.po.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jrnd.po.dao.PizzaDao;
import com.jrnd.po.entity.PizzaDO;

@Service
@Transactional
public class PizzaServiceImpl implements PizzaService {

	@Autowired
	PizzaDao dao;

	@Override
	public String savePizza(PizzaDO pizza) {
		return (String) dao.savePizza(pizza);
	}

	@Override
	public void deletePizza(String pizzaId) {
		dao.deletePizza(pizzaId);
	}

	@Override
	public void updatePizza(PizzaDO pizza) {
		dao.updatePizza(pizza);
	}

	@Override
	public PizzaDO getPizzaById(String pizzaId) {
		return dao.getPizzaById(pizzaId);
	}

	@Override
	public List<PizzaDO> getAllPizza() {
		return dao.getAllPizza();
	}

}
