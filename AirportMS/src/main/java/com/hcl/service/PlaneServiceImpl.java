package com.hcl.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.PlaneDao;
import com.hcl.entities.Plane;

@Service

public class PlaneServiceImpl implements PlaneService {
	@Autowired
	private PlaneDao dao;

	@Override
	@Transactional
	public void insertPlane(Plane plane) {
		dao.insert(plane);
	}

	@Transactional
	public List<Plane> getAllPlane() {
		return dao.getAllPlane();

	}
}
