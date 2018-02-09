package com.oasystem.services.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oasystem.dao.TMenuMapper;
import com.oasystem.dao.TPermissionMapper;
import com.oasystem.dao.TRoleMapper;
import com.oasystem.pojo.TMenu;
import com.oasystem.pojo.TPermission;
import com.oasystem.pojo.TRole;
import com.oasystem.pojo.TUser;
import com.oasystem.services.RoleService;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

	@Autowired
	private TRoleMapper roleRepository;

	@Autowired
	private TPermissionMapper permissionRepository;

	@Autowired
	private TMenuMapper menuRepository;

}
