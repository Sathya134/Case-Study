package com.hcl.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.PilotDao;
import com.hcl.entities.Pilot;
@Service
public class PilotServiceImpl implements PilotService {

	@Autowired
	private PilotDao dao;

	@Override
	@Transactional
	public void insertPilot(Pilot pilot) {
		dao.insert(pilot);
	}
}
