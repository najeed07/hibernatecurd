package com.glearning.hibernate.crud.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.glearning.hibernate.crud.model.Teacher;
import com.glearning.hibernate.crud.util.HibernateUtil;

public class TeacherService {
	
	private final SessionFactory sessionFactory;
	private Session session;

	public TeacherService() {
		this.sessionFactory = HibernateUtil.getSessionFactory();
	}
	
	public Teacher insertTeacherRecord(Teacher teacher) {
		
		try {
			session = sessionFactory.openSession();
			
			Transaction transaction = session.beginTransaction();
			
			Long result=(Long)session.save(teacher);
			System.out.println("Primary key of the stored teacher instance "+result);
			transaction.commit();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}finally {
			session.close();
		}
		return teacher;
	}

	public List<Teacher> findAllTeachers(){
		return null;
	}
	
	public Teacher findTeacherByTeacherId(long teacherId) {
		return null;
	}
	
	public void deleteTeacherRecordByTeacherId(long teacherId) {
		
	}
}
