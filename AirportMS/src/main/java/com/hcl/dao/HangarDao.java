package com.hcl.dao;

import java.util.List;

import com.hcl.entities.Hangar;

public interface HangarDao {

	public void insert(Hangar hangar);

	public List<Hangar> getAllHangar();


}
