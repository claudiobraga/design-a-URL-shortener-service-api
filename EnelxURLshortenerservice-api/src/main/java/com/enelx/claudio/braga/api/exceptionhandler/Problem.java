package com.enelx.claudio.braga.api.exceptionhandler;

import java.time.OffsetDateTime;

public class Problem {
	
	private Integer status;
	
	private String situation;
	
	private OffsetDateTime dateHour;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getSituation() {
		return situation;
	}

	public void setSituation(String situation) {
		this.situation = situation;
	}

	public OffsetDateTime getDateHour() {
		return dateHour;
	}

	public void setDateHour(OffsetDateTime dateHour) {
		this.dateHour = dateHour;
	}
}
