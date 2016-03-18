package com.ismailkuruca.ctb.repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ismailkuruca.ctb.domain.LabTest;

public interface LabTestRepository extends JpaRepository<LabTest, Long> {
	
	Optional<LabTest> findById(Long id);

	List<LabTest> findByName(String name);

	List<LabTest> findByEndDateBefore(LocalDateTime date);

}
