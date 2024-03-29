package com.sm.DAO;

import java.util.List;

import com.sm.DAO.api.Student;

public interface StudentDAO {
	List <Student> loadStudents();
	void saveStudent(Student student);
	Student getStudent(int id);
	void update();
	void update(Student student);
	void deleteStudent(int id);

}
