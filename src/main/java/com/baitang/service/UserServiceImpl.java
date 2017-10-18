package com.baitang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baitang.mapper.UserMapper;
import com.baitang.pojo.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		User userl = userMapper.selectByUsername(user.getUsername());
		if(userl != null ){
			return userl;
		}
		
		return null;
	}

	@Override
	public void update(User user) {
		userMapper.updateByPrimaryKey(user);
		
	}

}
