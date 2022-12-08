package com.glearning.hibernate.crud.client;

import com.glearning.hibernate.crud.model.Teacher;
import com.glearning.hibernate.crud.service.TeacherService;

public class TeacherClient {
	
	private static TeacherService teacherService= new TeacherService();
	
	
	public static void main(String[] args) {
		
		Teacher teacher = new Teacher("NK", 1500000, "nk@gmail");
		teacherService.insertTeacherRecord(teacher);
		
	}

}
