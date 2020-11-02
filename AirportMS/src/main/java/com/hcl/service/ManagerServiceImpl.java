package com.hcl.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.ManagerDao;
import com.hcl.entities.Manager;
@Service
public class ManagerServiceImpl implements ManagerService {

	@Autowired
	private ManagerDao dao;

	@Override
	@Transactional
	public void insertManager(Manager manager) {
		dao.insert(manager);
	}
}