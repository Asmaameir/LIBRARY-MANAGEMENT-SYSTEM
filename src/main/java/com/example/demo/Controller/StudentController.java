package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepository;
import com.example.demo.Service.StudentService;

@Controller
public class StudentController {
	
	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	@GetMapping("/Studentview")
	public String ListStudents(Model model) {
		model.addAttribute("students",studentService.getAllstudents());
		return "Studentview";
	}
	
	@GetMapping("/Studentview/new")
	public String CreateStudentForm(Model model) {
		Student student =new Student();
		model.addAttribute("student",student);	
		return "NewStudentview";
	}
	
	
	@PostMapping("/Students")
	public String saveStudent(@ModelAttribute("student")Student student) {
		studentService.saveStudent(student);
		return "redirect:/Studentview";
		
	
	}
	
	@GetMapping("/Studentview/edit/{id}")
	public String editStudentform(@PathVariable Long id,Model model) {
		model.addAttribute("student",studentService.getStudentById(id));
		return "edituser";
	}
	
	@PostMapping("/Studentview/{id}")
	public String updateStudent(@PathVariable Long id,@ModelAttribute("student")Student student, Model model) {
		
			Student existingStudent=studentService.getStudentById(id);
			
			existingStudent.setS_id(id);
			existingStudent.setFirstname(student.getFirstname());
			existingStudent.setLastname(student.getLastname());
			existingStudent.setUsername(student.getUsername());
			existingStudent.setEmail(student.getEmail());
			existingStudent.setPhoneno(student.getPhoneno());
			existingStudent.setCoursename(student.getCoursename());
			existingStudent.setYear(student.getYear());
			existingStudent.setPassword(student.getPassword());
			studentService.updateStudent(existingStudent);
			return "redirect:/Studentview";
	}
	
	@GetMapping("/Studentview/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deletestudentById(id);
		return "redirect:/Studentview";
	}
}
