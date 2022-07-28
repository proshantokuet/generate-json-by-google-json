package com.proshanto.bidiectionaljson.create.json.from.bidirectional.relation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proshanto.bidiectionaljson.create.json.from.bidirectional.relation.model.DashboardEngine;
import com.proshanto.bidiectionaljson.create.json.from.bidirectional.relation.repository.DashboardEngineRepository;

@Service
public class DashboardEngineService {

	@Autowired
	private DashboardEngineRepository dashboardConfigurationRepository;
	public List<DashboardEngine> findByName(String name){
		return dashboardConfigurationRepository.findByName(name);
	}
}
