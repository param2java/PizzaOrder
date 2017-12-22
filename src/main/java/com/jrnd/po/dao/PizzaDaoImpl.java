package com.jrnd.po.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.jrnd.po.entity.PizzaDO;
@Repository
public class PizzaDaoImpl implements PizzaDao {

	@Autowired
	HibernateTemplate ht;
	@Override
	public String savePizza(PizzaDO pizza) {
		return (String) ht.save(pizza)
 ;
	}

	@Override
	public void deletePizza(String pizzaId) {
		ht.delete(pizzaId);
	}

	@Override
	public void updatePizza(PizzaDO pizza) {
		ht.update(pizza);
	}

	@Override
	public PizzaDO getPizzaById(String pizzaId) {
		return ht.get(PizzaDO.class, pizzaId);
	}

	@Override
	public List<PizzaDO> getAllPizza() {
		return ht.loadAll(PizzaDO.class);
	}

}
