package com.simplilearn.hibernate.collections.done;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.IndexColumn;

@Entity
@Table (name = "AEMPLOYEE_RECORDS")
public class Employee 
{
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name = "EMPLOYEE_ID")
	private int empid;
	
	@Column (name = "EMPLOYEE_NAME")
	private String empname;
	
	@Column (name = "EMPLOYEE_DOB")
	private String empdob;
	
	@Column (name = "EMPLOYEE_QUALIFICATION")
	private String empqualification;
	
	@ElementCollection
	@JoinTable(name = "AEMPLOYEE_COURSE", joinColumns = @JoinColumn(name = "empid"))
	@IndexColumn(name = "idx")
	@Column (name = "COURSE")
	private String[] empcourse;
	
	@ElementCollection
	@JoinTable(name = "AEMPLOYEE_EMAILS", joinColumns = @JoinColumn(name = "empid"))
	@IndexColumn(name = "idx")
	@Column (name = "EMAILS")
	private List <String> empemails;
	
	@ElementCollection
	@JoinTable(name = "AEMPLOYEE_MARKS", joinColumns = @JoinColumn(name = "empid"))
	@Column (name = "MARKS")
	private List <Integer> empmarks;
	
	@ElementCollection
	@JoinTable(name = "AEMPLOYEE_PHONES", joinColumns = @JoinColumn(name = "empid"))
	@Column (name = "PHONES")
	private Set <Long> empphone;
	
	
	@ElementCollection
	@JoinTable(name = "AEMPLOYEE_REFERENCE", joinColumns = @JoinColumn(name = "empid"))
	@Column (name = "REF_PHONE")
	private Map<String, Long> empreference;

	public Employee()
	{
		super();
	}
	
	public Employee(String empname, String empdob, String empqualification, String[] empcourse,
			List<String> empemails, List<Integer> empmarks, Set<Long> empphone, Map<String, Long> empreference) {
		super();
		
		this.empname = empname;
		this.empdob = empdob;
		this.empqualification = empqualification;
		this.empcourse = empcourse;
		this.empemails = empemails;
		this.empmarks = empmarks;
		this.empphone = empphone;
		this.empreference = empreference;
	}
	
	public Employee(int empid, String empname, String empdob, String empqualification, String[] empcourse,
			List<String> empemails, List<Integer> empmarks, Set<Long> empphone, Map<String, Long> empreference) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empdob = empdob;
		this.empqualification = empqualification;
		this.empcourse = empcourse;
		this.empemails = empemails;
		this.empmarks = empmarks;
		this.empphone = empphone;
		this.empreference = empreference;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpdob() {
		return empdob;
	}

	public void setEmpdob(String empdob) {
		this.empdob = empdob;
	}

	public String getEmpqualification() {
		return empqualification;
	}

	public void setEmpqualification(String empqualification) {
		this.empqualification = empqualification;
	}

	public String[] getEmpcourse() {
		return empcourse;
	}

	public void setEmpcourse(String[] empcourse) {
		this.empcourse = empcourse;
	}

	public List<String> getEmpemails() {
		return empemails;
	}

	public void setEmpemails(List<String> empemails) {
		this.empemails = empemails;
	}

	public List<Integer> getEmpmarks() {
		return empmarks;
	}

	public void setEmpmarks(List<Integer> empmarks) {
		this.empmarks = empmarks;
	}

	public Set<Long> getEmpphone() {
		return empphone;
	}

	public void setEmpphone(Set<Long> empphone) {
		this.empphone = empphone;
	}

	public Map<String, Long> getEmpreference() {
		return empreference;
	}

	public void setEmpreference(Map<String, Long> empreference) {
		this.empreference = empreference;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empdob=" + empdob + ", empqualification="
				+ empqualification + ", empcourse=" + Arrays.toString(empcourse) + ", empemails=" + empemails
				+ ", empmarks=" + empmarks + ", empphone=" + empphone + ", empreference=" + empreference + "]";
	}
	
	

}
