package com.oasystem.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oasystem.dao.TPermissionMapper;
import com.oasystem.pojo.TPermission;
import com.oasystem.pojo.TUser;
import com.oasystem.services.PermissionService;

@Service
@Transactional
public class PermissionServiceImpl implements PermissionService {

	@Autowired
	private TPermissionMapper permissionRepository;

}
