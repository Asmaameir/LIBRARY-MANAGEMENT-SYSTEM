package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Admin;
import com.example.demo.Entity.Student;

@Service
public interface AdminService {
	List<Admin>getAllAdmins();
	Admin saveadmin(Admin admin);
	Admin getAdminById(Long id);
	Admin updateAdmin(Admin admin);
	void deleteadminById(Long id);


}
