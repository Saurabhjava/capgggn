package com.cg.Entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

@Entity
public class DL {
	@Id
	private String dlNo;
	private LocalDate issueDate;
	private LocalDate expDate;
	@ElementCollection
	@CollectionTable(name = "VehicleType", joinColumns = @JoinColumn(referencedColumnName = "dlNo"))
	@Column(name="vtype")
	private List<String> vType;
	public DL() {
		// TODO Auto-generated constructor stub
	}
	
	public DL(String dlNo, LocalDate issueDate, LocalDate expDate) {
		super();
		this.dlNo = dlNo;
		this.issueDate = issueDate;
		this.expDate = expDate;
	}

	public String getDlNo() {
		return dlNo;
	}
	public void setDlNo(String dlNo) {
		this.dlNo = dlNo;
	}
	public LocalDate getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}
	public LocalDate getExpDate() {
		return expDate;
	}
	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}
	public List<String> getvType() {
		return vType;
	}
	public void setvType(List<String> vType) {
		this.vType = vType;
	}

	@Override
	public String toString() {
		return "DL [dlNo=" + dlNo + ", issueDate=" + issueDate + ", expDate=" + expDate + ", vType=" + vType + "]";
	}
	
	
}
