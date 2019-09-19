package com.jpaAndHibernate.jpaAndHibernate.entities;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Course {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	
	@CreationTimestamp
	private LocalDateTime createdDate;
	
	@UpdateTimestamp
	private LocalDateTime lastUpdatedDate;
	
	@OneToMany(mappedBy = "course", orphanRemoval = true)
	private List<Review> reviews=new ArrayList<>();
	
	
	@ManyToMany
	@JoinTable(
			name="CourseStudent"
			)
	private List<Student> students=new ArrayList<>();
	
		
	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Student> getStudents() { 
		return students;
	}

	public void addStudent(Student student) {
		this.students.add(student);
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(LocalDateTime lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void addReview(Review review) {
		this.reviews.add(review);
	}
	public void removeReview(Review review) {
		this.reviews.remove(review);
	}

	public Course(String name) {
		super();
		this.name = name;
	}

	public Course() {
	}

	public Long getId() {
		return id;
	}

	private void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
