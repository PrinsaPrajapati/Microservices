package com.prinsa.microservices.review;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Review {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long reviewId;
	private String title;
	private String description;
	private double rating;
	private Long companyId;
	
	public Review() {
		super();
		
	}
	
	public Review(Long id, String title, String description, double rating, Long companyId) {
		super();
		this.reviewId = id;
		this.title = title;
		this.description = description;
		this.rating = rating;
		this.companyId = companyId;
	}

	public Long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	public Long getId() {
		return reviewId;
	}
	public void setId(Long id) {
		this.reviewId = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Review [id=" + reviewId + ", title=" + title + ", description=" + description + ", rating=" + rating + "]";
	}
	
	
}
