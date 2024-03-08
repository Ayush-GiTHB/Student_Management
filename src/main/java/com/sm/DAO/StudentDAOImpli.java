package com.sm.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mysql.cj.xdevapi.Statement;
import com.sm.DAO.api.Student;
import com.sm.rowmapper.StudentRowMapper;

@Repository
public class StudentDAOImpli implements StudentDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Student> loadStudents() {
		String sql = "SELECT * FROM students";
		List<Student> theListOfStudent = jdbcTemplate.query(sql, new StudentRowMapper());
		return theListOfStudent;
	}

	@Override
	public void saveStudent(Student student) {
		Object[] sqlParameters = { student.getName(), student.getMobile(), student.getCountry() };
		String sql = "INSERT INTO students(name, mobile, country) VALUES (?, ?, ?)";
		jdbcTemplate.update(sql, sqlParameters);
		System.out.println("1 record inserted");
	}

	@Override
	public Student getStudent(int id) {
		String sql = "SELECT * FROM students WHERE ID=?";
		Student student = jdbcTemplate.queryForObject(sql, new StudentRowMapper(), id);
		return student;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		String sql = "UPDATE STUDENTS SET name=?, mobile=?, country=? WHERE id=?";
		jdbcTemplate.update(sql, student.getName(), student.getMobile(), student.getCountry(), student.getId());
		System.out.println("1 record updated");
		
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		String sql="DELETE FROM STUDENTS WHERE ID=?";
		jdbcTemplate.update(sql,id);
		
	}

}
