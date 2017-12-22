package com.jrnd.po.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.jrnd.po.entity.UserDO;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	HibernateTemplate ht;
	
	@Override
	public String saveUser(UserDO user) {
		return (String) ht.save(user) ;
	}

	@Override
	public void deleteUser(String userId) {
		ht.delete(userId);
	}

	@Override
	public void updateUser(UserDO user) {
		ht.update(user);
	}

	@Override
	public UserDO getUserById(String userId) {
		return ht.get(UserDO.class, userId);
	}

	@Override
	public List<UserDO> getAllUser() {
		return ht.loadAll(UserDO.class);
	}

}
