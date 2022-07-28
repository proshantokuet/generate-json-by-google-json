package com.proshanto.bidiectionaljson.create.json.from.bidirectional.relation.rest.controller;

import static org.springframework.http.HttpStatus.OK;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.proshanto.bidiectionaljson.create.json.from.bidirectional.relation.service.DashboardEngineService;

@RestController
@RequestMapping("/rest/v1/dashboard/config")
public class DashboardEngineRestController {

	
	@Autowired
	private DashboardEngineService dashboardEngineService;
	@GetMapping("/list")
    public ResponseEntity<String> config() {
		
		Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		
		JsonObject ob = new JsonObject();
		ob.add("config", gson.toJsonTree(dashboardEngineService.findByName("filter")).getAsJsonArray());
		return new ResponseEntity<>(ob.toString(), OK);
    }
}
