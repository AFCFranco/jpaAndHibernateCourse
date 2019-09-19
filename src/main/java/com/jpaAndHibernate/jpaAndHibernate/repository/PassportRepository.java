package com.jpaAndHibernate.jpaAndHibernate.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jpaAndHibernate.jpaAndHibernate.entities.Course;
import com.jpaAndHibernate.jpaAndHibernate.entities.Passport;
import com.jpaAndHibernate.jpaAndHibernate.entities.Student;

@Repository
//@Transactional
public class PassportRepository {
	@Autowired
	EntityManager em;

	public Passport findById(Long id) {
		return em.find(Passport.class, id);
	}

	public void create(Passport pt) {
		System.out.println(pt);
		if (pt.getId() == null) {
			em.persist(pt);
		} else {
			em.merge(pt);
		}
	}
	public void deleteById(Long id) {
		Passport std=findById(id);
		em.remove(std);
		
	}


}
