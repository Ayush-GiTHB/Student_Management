package com.sm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.sm.DAO.StudentDAO;

import com.sm.DAO.api.Student;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDAO studentDAO 	;

	@Override
	public List<Student> loadStudents() {
		
		List<Student> studentList=studentDAO.loadStudents();


		return studentList;
	}

	@Override
	public void saveStudent(Student student) {
		
		//write business idea
		//industry requirement
		if(student.getCountry().equals("bharat")) {
			System.out.println("welcome mail sent to -Mr./Mrs"+student.getName());
		}
	
		studentDAO.saveStudent(student);
		
	}

	@Override
	public Student getStudent(int id) {


		
		return studentDAO.getStudent(id);
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		studentDAO.update(student);
		
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stu
		studentDAO.deleteStudent(id);
		
	}

	

	

	

}
