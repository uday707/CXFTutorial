package com.student;

import javax.jws.WebService;

@WebService
public interface ChangeStudentDetails {
	
	public Student changeName(Student student);

}
