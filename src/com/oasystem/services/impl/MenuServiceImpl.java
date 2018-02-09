package com.oasystem.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oasystem.dao.TMenuMapper;
import com.oasystem.pojo.TMenu;
import com.oasystem.pojo.TUser;
import com.oasystem.services.MenuService;

@Service
@Transactional
public class MenuServiceImpl implements MenuService {

	@Autowired
	private TMenuMapper menuRepository;


}
