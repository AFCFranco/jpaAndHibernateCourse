package com.jpaAndHibernate.jpaAndHibernate.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jpaAndHibernate.jpaAndHibernate.entities.Passport;
import com.jpaAndHibernate.jpaAndHibernate.entities.Student;


@Repository
@Transactional
public class StudentRepository {
	@Autowired
	EntityManager em;	
	public Student getStudentById(Long id) {
		return em.find(Student.class, id);
	}
	
	public void save(Student std) {
		System.out.println(std);
		if(std.getId()==null) {
			em.persist(std);
		}else {
			em.merge(std);
		}		
	}
	
	public void deleteById(Long id) {
		Student std=getStudentById(id);
		em.remove(std);
		
	}
	public boolean addPassport(Student st,Passport ps) {
		
		if(em.find(Passport.class, ps.getId())==null) {
			System.out.println(ps);
			em.persist(ps);			
		}			
		
		if(em.find(Student.class, st.getId())==null)
			em.persist(st);	
		st.setPassport(ps);
		System.out.println("here we pass");
		em.merge(st);
		return true;		
	}
}
