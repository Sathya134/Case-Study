package com.hcl.service;

import java.util.List;

import javax.transaction.Transactional;

import com.hcl.dao.AdminDao;
import com.hcl.dao.HangarDao;
import com.hcl.entities.Admin;
import com.hcl.entities.Hangar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HangarServiceImpl implements HangarService {
@Autowired
private HangarDao dao;

@Override
@Transactional
public void insertHangar(Hangar hangar) {
	dao.insert(hangar);
}

@Override
public List<Hangar> getAllHangar() {
	return null;
}
}