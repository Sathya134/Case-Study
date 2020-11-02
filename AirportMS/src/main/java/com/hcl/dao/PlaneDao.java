package com.hcl.dao;

import java.util.List;

import com.hcl.entities.Plane;

public interface PlaneDao {
	public void insert(Plane plane);

	public List<Plane> getAllPlane();

}
