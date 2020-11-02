package com.hcl.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.hcl.entities.Pilot;

@Repository
public class PilotDaoImpl implements PilotDao {
	@Autowired
	private SessionFactory factory;

	@Override
	public void insert(Pilot pilot) {
		factory.getCurrentSession().save(pilot);
	}

}
