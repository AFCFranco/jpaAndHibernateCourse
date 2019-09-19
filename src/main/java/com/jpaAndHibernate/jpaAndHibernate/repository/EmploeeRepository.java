package com.jpaAndHibernate.jpaAndHibernate.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jpaAndHibernate.jpaAndHibernate.entities.Course;
import com.jpaAndHibernate.jpaAndHibernate.entities.Emploee;
import com.jpaAndHibernate.jpaAndHibernate.entities.Review;
import com.jpaAndHibernate.jpaAndHibernate.entities.Student;

@Repository
@Transactional
public class EmploeeRepository {	
	@Autowired
	EntityManager em;
	
	
	public void insert(Emploee emp) {
		em.persist(emp);
	}

	
	public List<Emploee> retrieveAllEmploees(){
		return em.createNativeQuery("select * from Emploee").getResultList();
	}
	public Emploee findById(Long id) {
		return em.find(Emploee.class, id);
	}

	public void deleteById(Long id) {
		Emploee c = findById(id);
		em.remove(c);
	}
	
	public Emploee save(Emploee emploee) {
		System.out.println(emploee);
		if(emploee.getId()==null) {
			em.persist(emploee);
			return emploee;
		}else {
			em.merge(emploee);
			return emploee;
		}		
	}

}
