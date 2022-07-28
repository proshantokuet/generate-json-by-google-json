package com.proshanto.bidiectionaljson.create.json.from.bidirectional.relation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proshanto.bidiectionaljson.create.json.from.bidirectional.relation.model.DashboardEngine;
@Repository
public interface DashboardEngineRepository  extends JpaRepository<DashboardEngine, Long>{

	public List<DashboardEngine> findByName(String name);
}
