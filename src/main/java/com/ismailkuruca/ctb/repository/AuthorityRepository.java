package com.ismailkuruca.ctb.repository;

import com.ismailkuruca.ctb.domain.Authority;
import com.ismailkuruca.ctb.domain.LabTest;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
	
}
