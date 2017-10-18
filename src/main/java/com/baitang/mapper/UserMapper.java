package com.baitang.mapper;

import com.baitang.pojo.User;

public interface UserMapper {

	User selectByUsername(String username);
	void updateByPrimaryKey(User user);
	void insert(User user);

}
