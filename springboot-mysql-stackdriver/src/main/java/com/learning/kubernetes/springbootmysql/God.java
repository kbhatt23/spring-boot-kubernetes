package com.learning.kubernetes.springbootmysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bhagwan")
public class God {
	public Integer getId() {
		return id;
	}

	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	private String mantra;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMantra() {
		return mantra;
	}

	public void setMantra(String mantra) {
		this.mantra = mantra;
	}

}
