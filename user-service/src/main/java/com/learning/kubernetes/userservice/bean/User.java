package com.learning.kubernetes.userservice.bean;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name = "user_name" , unique = true )
	private String name;
	
	@Column(name = "user_age"  )	
	private Integer age;
	
	@Column(name = "is_user_football_fan"  )	
	private Boolean isFootballFan;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User() {
	}

	public User(String name, Integer age, Boolean isFootballFan) {
		this.name = name;
		this.age = age;
		this.isFootballFan = isFootballFan;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean getIsFootballFan() {
		return isFootballFan;
	}

	public void setIsFootballFan(Boolean isFootballFan) {
		this.isFootballFan = isFootballFan;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", isFootballFan=" + isFootballFan + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
