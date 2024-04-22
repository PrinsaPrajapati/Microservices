package com.prinsa.microservices.company;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long companyId;
	private String name;
	private String description;
	
	
	public Company() {
		super();
		
	}
	public Company(Long id, String name, String description) {
		super();
		this.companyId = id;
		this.name = name;
		this.description = description;
	}
	public Long getId() {
		return companyId;
	}
	public void setId(Long id) {
		this.companyId = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Company [id=" + companyId + ", name=" + name + ", description=" + description + "]";
	}
	
	
}
