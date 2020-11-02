package com.hcl.dao;

import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.hcl.entities.Admin;

@Repository
public class AdminDaoImpl implements AdminDao {
	@Autowired
	private SessionFactory factory;
	@Override
	public void insert(Admin admin) {
		factory.getCurrentSession().save(admin);
	}
}