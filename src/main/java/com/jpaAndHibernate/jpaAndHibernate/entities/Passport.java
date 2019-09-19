package com.jpaAndHibernate.jpaAndHibernate.entities;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Passport {
	@Id
	@GeneratedValue
	private Long id;
	private String number;
	@OneToOne(fetch = FetchType.LAZY,mappedBy = "passport"	)
	private Student student;
	 
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Passport(String number) {
		super();
		this.number = number;
	}

	public Passport() {
	}

	public Long getId() {
		return id;
	}

	private void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return number;
	}

	public void setName(String name) {
		this.number = name;
	}

	@Override
	public String toString() {
		return "Passport [id=" + id + ", number=" + number + "]";
	}

	
}
