package com.ismailkuruca.ctb.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "CTB_LAB_TEST_RESULT")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class LabTestResult extends AbstractAuditingEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	
	@ManyToOne(targetEntity = LabTest.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "LAB_TEST")
	private LabTest labTest;
	
	@ManyToOne(targetEntity = LabTestMarker.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "MARKER")
	private LabTestMarker marker;
	
	@Column(name = "VALUE")
	@NotNull
	private String value;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LabTest getLabTest() {
		return labTest;
	}

	public void setLabTest(LabTest labTest) {
		this.labTest = labTest;
	}

	public LabTestMarker getMarker() {
		return marker;
	}

	public void setMarker(LabTestMarker marker) {
		this.marker = marker;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "LabTestResult [id=" + id + ", labTest=" + labTest + ", marker=" + marker + ", value=" + value + "]";
	}

}
