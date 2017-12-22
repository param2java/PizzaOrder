package com.jrnd.po.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.jrnd.po.entity.AddressDO;
@Repository
public class AddressDaoImpl implements AddressDao {

	@Autowired
	HibernateTemplate ht;
	@Override
	public String saveAddress(AddressDO address) {
		return (String) ht.save(address);
	}

	@Override
	public void deleteAddress(String addressId) {
		ht.delete(addressId);
	}

	@Override
	public void updateAddress(AddressDO address) {
		ht.update(address);
	}

	@Override
	public AddressDO getAddressById(String addressId) {
		return ht.get(AddressDO.class, addressId);
	}

	@Override
	public List<AddressDO> getAllAddress() {
		return ht.loadAll(AddressDO.class);
	}

}
