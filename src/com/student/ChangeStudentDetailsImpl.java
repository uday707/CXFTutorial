package com.student;

import javax.jws.WebService;

@WebService(endpointInterface="com.student.ChangeStudentDetails")
public class ChangeStudentDetailsImpl implements ChangeStudentDetails {

	@Override
	public Student changeName(Student student) {
		// TODO Auto-generated method stub
		student.setName("Hello "+ student.getName());
		return student;
	}

}
