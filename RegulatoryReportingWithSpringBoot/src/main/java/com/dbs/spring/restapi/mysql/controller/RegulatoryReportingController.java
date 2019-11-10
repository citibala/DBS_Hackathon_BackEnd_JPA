package com.dbs.spring.restapi.mysql.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.spring.restapi.mysql.model.SummaryReport;
import com.dbs.spring.restapi.mysql.repo.SummaryReportRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class RegulatoryReportingController {

	@Autowired
	SummaryReportRepository repository;

	@GetMapping("/reports")
	public ResponseEntity<List<SummaryReport>> getAllReprots() {
		List<SummaryReport> reports = new ArrayList<>();
		try {
			repository.findAll().forEach(reports::add);
			
			if (reports.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(reports, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/reports/{id}")
	public ResponseEntity<SummaryReport> getCustomerById(@PathVariable("id") long id) {
		Optional<SummaryReport> data = repository.findById(id);

		if (data.isPresent()) {
			return new ResponseEntity<>(data.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	

	
}
