package de.vit.pl.entity;

import java.util.Date;

public class Pferd {
	private Date gebDatum;
	private String pferdLNR;
	private Long id;
	private String name;

	public Date getGebDatum() {
		return gebDatum;
	}

	public void setGebDatum(Date gebDatum) {
		this.gebDatum = gebDatum;
	}

	public String getPferdLNR() {
		return pferdLNR;
	}

	public void setPferdLNR(String pferdLNR) {
		this.pferdLNR = pferdLNR;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId(){
		return this.id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
