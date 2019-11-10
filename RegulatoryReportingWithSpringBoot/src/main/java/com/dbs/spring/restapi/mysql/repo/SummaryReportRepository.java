package com.dbs.spring.restapi.mysql.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.dbs.spring.restapi.mysql.model.SummaryReport;

public interface SummaryReportRepository extends CrudRepository<SummaryReport, Long> {
	//List<SummaryReport> findByDays(int topLevelId);
}
