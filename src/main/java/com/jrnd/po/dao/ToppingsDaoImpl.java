package com.jrnd.po.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.jrnd.po.entity.ToppingsDO;
@Repository
public class ToppingsDaoImpl implements ToppingsDao{

	@Autowired
	HibernateTemplate ht;
	@Override
	public String saveToppings(ToppingsDO toppings) {
		return (String) ht.save(toppings);
	}

	@Override
	public void deleteToppings(String ToppingsId) {
		ht.delete(ToppingsId);
	}

	@Override
	public void updateToppings(ToppingsDO Toppings) {
		ht.update(Toppings);
	}

	@Override
	public ToppingsDO getToppingById(String ToppingsId) {
		return ht.get(ToppingsDO.class, ToppingsId);
	}

	@Override
	public List<ToppingsDO> getAllToppings() {
		return ht.loadAll(ToppingsDO.class);
	}

}
