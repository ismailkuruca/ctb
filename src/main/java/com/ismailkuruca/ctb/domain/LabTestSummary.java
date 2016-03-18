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

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "CTB_LAB_TEST_SUMMARY")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class LabTestSummary extends AbstractAuditingEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	
	@ManyToOne(targetEntity = User.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "USER")
	private User user;
	
	@ManyToOne(targetEntity = LabTest.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "LAB_TEST")
	private LabTest labTest;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public LabTest getLabTest() {
		return labTest;
	}

	public void setLabTest(LabTest labTest) {
		this.labTest = labTest;
	}

	@Override
	public String toString() {
		return "LabTestSummary [id=" + id + ", user=" + user + ", labTest=" + labTest + "]";
	}
	
}
