package com.exspensetracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exspensetracker.entity.ExspenseData;

@Repository
public interface ExspenseDataRepository extends JpaRepository<ExspenseData,Integer>{ 

}
