package com.app.service.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exception.CustomException;
import com.app.entities.Admin;
import com.app.repository.AdminRepository;
import com.app.service.AdminService;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public Admin getAdminByEmail(String email) {		
		Optional<Admin> optional = adminRepository.findByEmail(email);
		return optional.orElseThrow(()->new CustomException("Invalid email"));
	}

}
