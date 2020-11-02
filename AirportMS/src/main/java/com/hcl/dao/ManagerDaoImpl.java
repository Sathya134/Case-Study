package com.hcl.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.entities.Manager;
@Repository
public class ManagerDaoImpl implements ManagerDao {

	@Autowired
	private SessionFactory factory;

	@Override
	public void insert(Manager manager) {
		factory.getCurrentSession().save(manager);
	}
}
