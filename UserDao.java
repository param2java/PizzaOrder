package com.jrnd.po.dao;

import java.util.List;

import com.jrnd.po.entity.UserDO;

public interface UserDao {

	String saveUser(UserDO user);
	void deleteUser(String userId);
	void updateUser(UserDO user);
	UserDO getUserById (String userId);
	List<UserDO> getAllUser();
}
