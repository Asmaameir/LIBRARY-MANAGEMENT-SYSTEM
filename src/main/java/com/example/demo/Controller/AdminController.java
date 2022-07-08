package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Entity.Admin;
import com.example.demo.Entity.Student;
import com.example.demo.Service.AdminService;

@Controller
public class AdminController {
	private AdminService adminService;

	public AdminController(AdminService adminService) {
		super();
		this.adminService = adminService;
	}
	
	@GetMapping("/AdminView")
	public String ListAdmin(Model model) {
		model.addAttribute("admins",adminService.getAllAdmins());
		return "AdminView";
	}
	@GetMapping("/Admins/new")
	public String createnewAdmin(Model model) {
		Admin admin=new Admin();
		model.addAttribute("admin",admin);
		return "NewAdminView";
	}
	@PostMapping("/Admins")
	public String saveAdmin(@ModelAttribute("admin")Admin admin) {
		adminService.saveadmin(admin);
		return "redirect:/AdminView";
	}
	@GetMapping("/AdminView/edit/{id}")
	public String editAdminform(@PathVariable Long id,Model model) {
		model.addAttribute("admin",adminService.getAdminById(id));
		return "EditAdmin";
	}
	
	@PostMapping("/Adminview/{id}")
	public String updateAdmin(@PathVariable Long id,@ModelAttribute("admin")Admin admin, Model model) {
		
			Admin existingAdmin=adminService.getAdminById(id);
			
			existingAdmin.setA_id(id);
			existingAdmin.setA_username(admin.getA_username());
			
			existingAdmin.setA_password(admin.getA_password());
			
			
			existingAdmin.setA_password(admin.getA_password());
			adminService.updateAdmin(existingAdmin);
			return "redirect:/AdminView";
	}
	
	@GetMapping("/AdminView/{id}")
	public String deleteStudent(@PathVariable Long id) {
		adminService.deleteadminById(id);
		return "redirect:/AdminView";
	}
	
	
	

}
