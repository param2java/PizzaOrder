package com.jrnd.po.dao;

import java.util.List;

import com.jrnd.po.entity.AddressDO;

public interface AddressDao {

	String saveAddress(AddressDO address);
	void deleteAddress(String addressId);
	void updateAddress(AddressDO address);
	AddressDO getAddressById (String addressId);
	List<AddressDO> getAllAddress();
}
