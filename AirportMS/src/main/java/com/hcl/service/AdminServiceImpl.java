package com.hcl.service;

import javax.transaction.Transactional;

import com.hcl.dao.AdminDao;
import com.hcl.entities.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminDao dao;

	@Override
	@Transactional
	public void insertUser(Admin admin) {
		dao.insert(admin);
	}
}
