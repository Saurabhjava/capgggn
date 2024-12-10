package com.cg.Entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class DL {
	@Id
	private String dlNo;
	private LocalDate issueDate;
	private LocalDate expDate;
	private String rtoName;
	@OneToOne(mappedBy = "dl")
	private Person person;
	@ElementCollection
	@CollectionTable(name = "VehicleType", joinColumns = @JoinColumn(referencedColumnName = "dlNo"))
	@Column(name="vtype")
	private List<String> vType;
	public DL() {
		// TODO Auto-generated constructor stub
	}
	
	public DL(LocalDate issueDate, LocalDate expDate, String rtoName, Person person) {
		super();
		this.person=person;
		this.dlNo = person.getName().substring(0,2)+expDate.toString().substring(5,7)+rtoName.substring(0, 3)+person.getDob().toString().substring(0,4);
		this.issueDate = issueDate;
		this.expDate = expDate;
		this.rtoName=rtoName;
	}
	public String getRtoName() {
		return rtoName;
	}

	public void setRtoName(String rtoName) {
		this.rtoName = rtoName;
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
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
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
