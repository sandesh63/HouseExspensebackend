package com.exspensetracker.service;



import java.util.List;

import org.springframework.http.ResponseEntity;

import com.exspensetracker.dto.AdminDTO;
import com.exspensetracker.dto.ExspenseDataDTO;

public interface ExspenseDataService {

	String createData(ExspenseDataDTO exspenseDataDTO);

	List<ExspenseDataDTO> getData();

	ResponseEntity<String> createLogin(AdminDTO adminDTO);



	

}
