package com.ismailkuruca.ctb.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.ismailkuruca.ctb.Application;
import com.ismailkuruca.ctb.domain.LabTest;
import com.ismailkuruca.ctb.domain.LabTestMarker;
import com.ismailkuruca.ctb.repository.LabTestRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest
@Transactional
public class LabTestServiceTest {
	
	@Inject
	LabTestRepository labTestRepository;
	
	@Test
	public void newEntryTest() {
		LabTest labTest = new LabTest();
		labTest.setStartDate(LocalDateTime.now());
		labTest.setEndDate(LocalDateTime.now());
		labTest.setName("as");
		
		LabTestMarker labTestMarker = new LabTestMarker();
		labTestMarker.setName("asd");
		labTestMarker.setReferenceValue("aaa");
		List<LabTestMarker> markers = new ArrayList<LabTestMarker>();
		markers.add(labTestMarker);
		labTest.setMarkers(markers);
		
		labTestRepository.save(labTest);
		
		List<LabTest> findAll = labTestRepository.findAll();
		System.out.println(findAll);
		Assertions.assertThat(findAll.size() > 0);
	}
}
