package com.jpaAndHibernate.jpaAndHibernate;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.CommandLinePropertySource;
import org.springframework.transaction.annotation.Transactional;

import com.jpaAndHibernate.jpaAndHibernate.entities.Course;
import com.jpaAndHibernate.jpaAndHibernate.entities.Emploee;
import com.jpaAndHibernate.jpaAndHibernate.entities.FUllTimeEmploee2;
import com.jpaAndHibernate.jpaAndHibernate.entities.Passport;
import com.jpaAndHibernate.jpaAndHibernate.entities.Review;
import com.jpaAndHibernate.jpaAndHibernate.entities.Student;
import com.jpaAndHibernate.jpaAndHibernate.repository.CourseRepository;
import com.jpaAndHibernate.jpaAndHibernate.repository.EmploeeRepository;
import com.jpaAndHibernate.jpaAndHibernate.repository.PassportRepository;
import com.jpaAndHibernate.jpaAndHibernate.repository.ReviewRepository;
import com.jpaAndHibernate.jpaAndHibernate.repository.StudentRepository;

@SpringBootApplication
public class JpaAndHibernateApplication implements CommandLineRunner {
	Logger logger=org.slf4j.LoggerFactory.getLogger(this.getClass());

	@Autowired
	CourseRepository cr;
	@Autowired
	StudentRepository sr;
	@Autowired
	PassportRepository pr;
	@Autowired
	ReviewRepository rr;
	
	@Autowired
	EntityManager em;
	
	@Autowired
	EmploeeRepository er;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaAndHibernateApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//Student std=sr.getStudentById(20001l);//new Student(20004l,"Studente 5");
		//sr.save(std);
//		Student st=sr.getStudentById(20001l) ; 
//		System.out.println(st);
//		Passport pt=pr.findById(30001l);
//		System.out.println(pt.getStudent()); 
//		System.out.println(pt); 
//		pr.deleteById(30001l);
//		sr.deleteById(20001l);
//		Course course1=cr.findById(10002l);
//		course1.getReviews().forEach(System.out::println);
//		Course course2=cr.findById(10001l);
//		Course course3=new Course("leches 2");
//		Review review1=new Review("great Course", 100l);
//		cr.save(course3);
//		rr.save(review1);
//		System.out.println(cr.addReview(course3, review1));
//		//for(int i=0;i<10;i++)cr.addReview(course3, rr.save(new Review("great Course "+i, 10l)));
		Emploee emploee1=new FUllTimeEmploee2("Carlo",new BigDecimal(2000000));
		er.insert(emploee1);
		
		
		
		
		
		 
		
		 
	
		}
	

}
