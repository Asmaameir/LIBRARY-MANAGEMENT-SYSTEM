package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Admin;
import com.example.demo.Repository.AdminRepository;
import com.example.demo.Service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
	private AdminRepository adminRepository;

	public AdminServiceImpl(AdminRepository adminRepository) {
		super();
		this.adminRepository = adminRepository;
	}

	@Override
	public List<Admin> getAllAdmins() {
		// TODO Auto-generated method stub
		return adminRepository.findAll();
	}

	@Override
	public Admin saveadmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepository.save(admin);
	}

	@Override
	public Admin getAdminById(Long id) {
		// TODO Auto-generated method stub
		return adminRepository.findById(id).get();
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepository.save(admin) ;
	}

	@Override
	public void deleteadminById(Long id) {
		// TODO Auto-generated method stub
		adminRepository.deleteById(id);
		
	}
	

}
