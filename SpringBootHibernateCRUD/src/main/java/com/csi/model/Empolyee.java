package com.csi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "employee")
public class Empolyee {

	@Id@GeneratedValue
	@Column(name = "emp_Id")
	private int empId;
	
	@Column(name = "emp_Name")
	private String empName;
	@Column(name = "emp_Address")
	private String empAddress;
	@Column(name = "emp_Contact_Number")
	private long empContactNo;
	@Column(name = "emp_Salary")
	private double empSalary;
	@JsonFormat (pattern ="dd-MM-yyyy")
	@Column(name = "emp_Dob")
	private Date empDob;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public long getEmpContactNo() {
		return empContactNo;
	}

	public void setEmpContactNo(long empContactNo) {
		this.empContactNo = empContactNo;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public Date getEmpDob() {
		return empDob;
	}

	public void setEmpDob(Date empDob) {
		this.empDob = empDob;
	}

	@Override
	public String toString() {
		return "Empolyee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + ", empContactNo="
				+ empContactNo + ", empSalary=" + empSalary + ", empDob=" + empDob + "]";
	}

}
