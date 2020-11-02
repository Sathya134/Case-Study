package com.hcl.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.hcl.entities.Hangar;
@Repository
public class HangarDaoImpl implements HangarDao {

	@Autowired
	private SessionFactory factory;
	@Override
	public void insert(Hangar hangar) {
		factory.getCurrentSession().save(hangar);
	}
	@Override
	public List<Hangar> getAllHangar() {
		return null;
	}

}
