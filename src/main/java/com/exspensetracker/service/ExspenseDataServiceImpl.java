package com.exspensetracker.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.exspensetracker.dto.AdminDTO;
import com.exspensetracker.dto.ExspenseDataDTO;
import com.exspensetracker.entity.Admin;
import com.exspensetracker.entity.ExspenseData;
import com.exspensetracker.repository.AdminRepo;
import com.exspensetracker.repository.ExspenseDataRepository;

@Service(value="ExspenseDataService")
public class ExspenseDataServiceImpl implements ExspenseDataService {
@Autowired
private ExspenseDataRepository exspenseDataRepository;
@Autowired
private AdminRepo adminrepo;
	@Override
	public String createData(ExspenseDataDTO exspenseDataDTO) {
		// TODO Auto-generated method stub
		Optional<ExspenseData> received=exspenseDataRepository.findById(exspenseDataDTO.getId());
		if(received.isEmpty())
		{
			ExspenseData exspenseData=new ExspenseData();
			exspenseData.setId(exspenseDataDTO.getId());
			exspenseData.setCategory(exspenseDataDTO.getCategory());
			exspenseData.setAmount(exspenseDataDTO.getAmount());
			exspenseData.setDate(exspenseDataDTO.getDate());
			exspenseData.setWork(exspenseDataDTO.getWork());
			exspenseData.setReceiver(exspenseDataDTO.getReceiver());
			exspenseData.setMessage(exspenseDataDTO.getMessage());
			exspenseDataRepository.saveAndFlush(exspenseData);
			return "Exspense Data created Successfully ";	
		}
		else
		{
			return "Exspense Data creation failed";	
		}
	
	}
	@Override
	public List<ExspenseDataDTO> getData() {
		// TODO Auto-generated method stub
		Iterable<ExspenseData> allData=exspenseDataRepository.findAll();
		List<ExspenseDataDTO> exspenseList=new ArrayList<>();
		
		allData.forEach(item->{
			ExspenseDataDTO exspenseDataDTO=new ExspenseDataDTO();
			exspenseDataDTO.setId(item.getId());
			exspenseDataDTO.setCategory(item.getCategory());
			exspenseDataDTO.setAmount(item.getAmount());
			exspenseDataDTO.setDate(item.getDate());
			exspenseDataDTO.setReceiver(item.getReceiver());
			exspenseDataDTO.setWork(item.getWork());
			exspenseDataDTO.setMessage(item.getMessage());
			exspenseList.add(exspenseDataDTO);
			
			
			
		});
		return exspenseList;
	}
	@Override
	public ResponseEntity<String> createLogin(AdminDTO adminDTO) {
		// TODO Auto-generated method stub
		Optional<Admin> received=adminrepo.findByEmailIdAndPassword(adminDTO.getEmailId(),adminDTO.getPassword());
		if(received.isPresent())
			
		{
			return ResponseEntity.ok("login Success");
			
		}
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("invalid credentials");
		
	}


	

}
