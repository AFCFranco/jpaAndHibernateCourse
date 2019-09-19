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
public class CourseRepository {
	@Autowired
	EntityManager em;

	public Course findById(Long id) {
		return em.find(Course.class, id);
	}

	public void deleteById(Long id) {
		Course c = findById(id);
		em.remove(c);
	}
	
	public Course save(Course course) {
		System.out.println(course);
		if(course.getId()==null) {
			em.persist(course);
			return course;
		}else {
			em.merge(course);
			return course;
		}		
	}

	public boolean addReview(Course course, Review review) {
		
		if (findById(course.getId()) == null) {
			return false;
		} else {
			if (review.getId() == null)
				return false;
			else {
				course.addReview(review);
				review.setCourse(course);

				
			}
			System.out.println("asdf  "+course.getReviews().get(0));
			return true;
		}
	}

}
