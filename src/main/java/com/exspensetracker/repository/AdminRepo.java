package com.exspensetracker.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exspensetracker.entity.Admin;

public interface AdminRepo extends JpaRepository<Admin,String>{

	Optional<Admin> findByEmailIdAndPassword(String emailId, String password);



}
