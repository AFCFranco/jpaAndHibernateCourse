package com.jpaAndHibernate.jpaAndHibernate.entities;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Review {
	@Id
	@GeneratedValue
	private Long id;
	private String description;
	private Long rating;
	@ManyToOne 
	private Course course;
	
	
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getRating() {
		return rating;
	}

	public void setRating(Long rating) {
		this.rating = rating;
	}

	public Review() {
	}

	public Review( String description, Long rating) {
		super();
		this.id = id;
		this.description = description;
		this.rating = rating;
	}

	public Long getId() {
		return id;
	}

	private void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return description;
	}

	public void setName(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", description=" + description + ", rating=" + rating + ", course=" + course + "]";
	}	

}
