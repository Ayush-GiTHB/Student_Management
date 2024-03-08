package com.sm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sm.DAO.StudentDAO;
import com.sm.DAO.api.Student;
import com.sm.service.StudentService;

import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class StudentController {
	
	
	@Autowired
	private StudentService studentService;

	@GetMapping("/showStudent")
	public String showStudnetList(Model model) {
		
// call service  to get data
		
		List<Student> studentList = studentService.loadStudents();
		for (Student tempStudent : studentList) {
			System.out.println(tempStudent);
		}
		model.addAttribute("students", studentList);
		return "student-list";
	}
	@GetMapping("/showAddStudentPage")
	public String addSrudent(Model model) {
		
		Student student=new Student();
		
		model.addAttribute("student", student);

		return "add-student";
	}
	
	@PostMapping("/save-student")
	public String saveStudemnt(Student student) {
		
		System.out.println(student);
		//WRITE LOGIC TO SAVE DATA
		//do a condition check
		//if user don't have id then insert a new data for student
		
		
		//if user have id then update the data for that id
		if(student.getId()==0) {
			//insert new record
			studentService.saveStudent(student);
		}
		else {
			//do an update
			studentService.update(student);
		}
		
		

		return "redirect:/showStudent";
	}
	@GetMapping("/updateStudent")
	public String updateStudent(@RequestParam("userId")int id,Model model) {
// can be done in this way as well instead of @model annotation		
//		Student myStudent=new Student();
//		model.addAttribute("student", myStudent);
		
		System.out.println("looking for data whose id is "+ id);
		
		
		Student theStudent=studentService.getStudent(id);
		System.out.println(theStudent);
		model.addAttribute("student", theStudent);
		
		
		return "add-student";
	}
	@GetMapping("/deleteStudent")
	public String deleteteStudent(@RequestParam("userId")int id) {
		
				//capture the id whoose data is to be deleted
		//service csll to delete the data
		studentService.deleteStudent(id);
				
				return "redirect:/showStudent";
	

	}
}
