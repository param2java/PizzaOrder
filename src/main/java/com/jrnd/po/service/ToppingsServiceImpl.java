package com.jrnd.po.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jrnd.po.dao.ToppingsDao;
import com.jrnd.po.entity.ToppingsDO;
@Service
@Transactional
public class ToppingsServiceImpl implements ToppingsService{

	@Autowired
	ToppingsDao dao;;
	@Override
	public String saveToppings(ToppingsDO toppings) {
		return (String) dao.saveToppings(toppings);
	}

	@Override
	public void deleteToppings(String ToppingsId) {
		dao.deleteToppings(ToppingsId);
	}

	@Override
	public void updateToppings(ToppingsDO Toppings) {
		dao.updateToppings(Toppings);
	}

	@Override
	public ToppingsDO getToppingById(String ToppingsId) {
		return dao.getToppingById(ToppingsId);
	}

	@Override
	public List<ToppingsDO> getAllToppings() {
		return dao.getAllToppings();
	}

}
