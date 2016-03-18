package com.ismailkuruca.ctb.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ismailkuruca.ctb.domain.LabTestSummary;
import com.ismailkuruca.ctb.domain.User;

public interface LabTestSummaryRepository extends JpaRepository<LabTestSummary, Long>{
	
	Optional<LabTestSummary> findById(Long id);
	
	List<LabTestSummary> findAll();
	
	List<LabTestSummary> findByUser(User user);

}
