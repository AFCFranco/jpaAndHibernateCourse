package com.jpaAndHibernate.jpaAndHibernate.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jpaAndHibernate.jpaAndHibernate.entities.Course;
import com.jpaAndHibernate.jpaAndHibernate.entities.Review;
import com.jpaAndHibernate.jpaAndHibernate.entities.Student;


@Repository
@Transactional
public class ReviewRepository {
	@Autowired
	EntityManager em;
	
	public Review findById(Long id) {
		return em.find(Review.class, id);
	}
	public void deleteById(Long id) {
		Review c=findById(id);
		em.remove(c);		
	}
	public Review save(Review review) {
		System.out.println(review);
		if(review.getId()==null) {
			em.persist(review);
			return review;
		}else {
			em.merge(review);
			return review;
		}		
	}
	
}
