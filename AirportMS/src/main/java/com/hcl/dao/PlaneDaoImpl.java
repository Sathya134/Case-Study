package com.hcl.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.entities.Plane;

@Repository
public class PlaneDaoImpl implements PlaneDao {
	@Autowired
	private SessionFactory factory;
	@Override
	public void insert(Plane plane) {
		factory.getCurrentSession().save(plane);
	}
	@Override
	public List<Plane> getAllPlane() {
		return null;
	}

}
