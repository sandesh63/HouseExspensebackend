package com.exspensetracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exspensetracker.dto.AdminDTO;
import com.exspensetracker.dto.ExspenseDataDTO;
import com.exspensetracker.service.ExspenseDataService;
import com.exspensetracker.exception.UnauthorizedException;



@RestController
@CrossOrigin
public class ExspenseDataController {
	
	@Autowired
	private ExspenseDataService exspenseDataService;
	@PostMapping("/create")
	public ResponseEntity<String> createExpense(@RequestBody ExspenseDataDTO exspenseDataDTO ){
		String received=exspenseDataService.createData(exspenseDataDTO);
		return new ResponseEntity<String>(received,HttpStatus.OK);
	}
	@GetMapping("/getlist")
	public ResponseEntity<List<ExspenseDataDTO>>getExspenseData(){
		
		return new ResponseEntity<List<ExspenseDataDTO>>(exspenseDataService.getData(),HttpStatus.OK);
	}
	@PostMapping("/login")
	public ResponseEntity<String> adminLogin(@RequestBody AdminDTO adminDTO ){
		try{
		ResponseEntity<String> received=exspenseDataService.createLogin(adminDTO);
			return new ResponseEntity<String>(HttpStatus.OK);
		}
		catch(UnauthorizedException e)
			{
				return new ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("invalid username and password");
				
			}
				
		
	}

}
