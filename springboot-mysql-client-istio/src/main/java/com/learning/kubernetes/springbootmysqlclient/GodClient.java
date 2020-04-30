package com.learning.kubernetes.springbootmysqlclient;

public class GodClient {
	private Integer id;

	private String name;

	private String mantra;

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMantra(String mantra) {
		this.mantra = mantra;
	}

	public String getName() {
		return name;
	}

	public String getMantra() {
		return mantra;
	}
	
	public Integer getId() {
		return id;
	}

}
