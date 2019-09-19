insert into course(id, name,created_date,last_Updated_Date)
	values(10001,'course 1',sysdate(),sysdate());
insert into course(id, name,created_date,last_Updated_Date)
	values(10002,'course 2',sysdate(),sysdate());
insert into course(id, name,created_date,last_Updated_Date)
	values(10003,'course 3',sysdate(),sysdate());

	
insert into Passport(id,number) values(30001,'passport1');
insert into Passport(id,number) values(30002,'passport2');
insert into Passport(id,number) values(30003,'passport3');
insert into Passport(id,number) values(30004,'passport4');
  

insert into student(id,name,passport_id) values(20001,'name1',30001);
insert into student(id,name,passport_id) values(20002,'name2',30002);
insert into student(id,name,passport_id) values(20003,'name2',30003); 

insert into Review(id,description,rating,course_id) values(40001,'review 1',3,10002);
insert into Review(id,description,rating,course_id) values(40002,'review 2',3,10002);
insert into Review(id,description,rating,course_id) values(40003,'review 3',3,10002);

insert into course_student(courses_id,students_id) values(10003,20001);
insert into course_student(courses_id,students_id) values(10001,20001);
insert into course_student(courses_id,students_id) values(10002,20001);
 
