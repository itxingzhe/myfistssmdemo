package com.baitang.service;

import com.baitang.pojo.User;

public interface UserService {

	User login(User user);

	void update(User user);

}
