package com.oasystem.services;


import com.oasystem.pojo.TUser;

public interface UserService {

	void saveUser(TUser tuser);
	TUser queryUser(TUser tuser);
}
