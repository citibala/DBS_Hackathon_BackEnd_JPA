package com.dbs.spring.restapi.mysql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "report")
public class SummaryReport {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "name")
	private String name;
	
	@Column(name = "equity_level")
	private String equityLevel;
	
	@Column(name = "trade_type")
	private String tradeType;
	
	@Column(name = "top_level_id")
	private  Integer topLevelId;
	
	@Column(name = "trade_id")
	private String tradeId;
	
	@Column(name = "market_value")
	private Integer marketValue;
	
	public String getEquityLevel() {
		return equityLevel;
	}

	public void setEquityLevel(String equityLevel) {
		this.equityLevel = equityLevel;
	}

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public Integer getTopLevelId() {
		return topLevelId;
	}

	public void setTopLevelId(Integer topLevelId) {
		this.topLevelId = topLevelId;
	}

	public String getTradeId() {
		return tradeId;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public Integer getMarketValue() {
		return marketValue;
	}

	public void setMarketValue(Integer marketValue) {
		this.marketValue = marketValue;
	}

	
	public SummaryReport() {
	}

	public SummaryReport(String name) {
		this.name = name;

	}

	public long getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

}
