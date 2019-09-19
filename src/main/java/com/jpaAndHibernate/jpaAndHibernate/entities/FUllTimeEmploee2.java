package com.jpaAndHibernate.jpaAndHibernate.entities;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class FUllTimeEmploee2 extends Emploee {
	private BigDecimal salary;

	public FUllTimeEmploee2(String name, BigDecimal hourBigDecimal) {
		super(name);
		this.salary=hourBigDecimal;		
	}	
}
