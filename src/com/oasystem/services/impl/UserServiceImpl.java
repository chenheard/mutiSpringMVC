package com.oasystem.services.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.oasystem.dao.TRoleMapper;
import com.oasystem.dao.TUserMapper;
import com.oasystem.pojo.TUser;
import com.oasystem.services.UserService;
@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private TUserMapper userRepository;
	@Autowired
	private TRoleMapper roleRepository;
	@Override
	public void saveUser(TUser tuser) {
		userRepository.insertSelective(tuser);
	}
	@Override
	public TUser queryUser(TUser tuser) {
		return userRepository.selectByNamePwd(tuser);
	}
}
