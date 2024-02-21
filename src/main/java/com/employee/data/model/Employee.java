package com.employee.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table (name = "employee")
public class Employee {

	@Id
	@Column(name="employee_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotBlank(message = "employee name can't be left empty")
	@NotEmpty(message = "Must not be Empty and NULL")
	private int employeeID;
	
	@NotEmpty(message = "Must not be Empty and NULL")
	@NotBlank(message = "employee name can't be left empty")
	@Column(name="first_name")
	private String firstName;
	
	@NotEmpty(message = "Must not be Empty and NULL")
	@NotBlank(message = "employee name can't be left empty")
	@Column(name="last_name")
	private String lastName;
	
	@NotEmpty(message = "Must not be Empty and NULL")
	@NotBlank(message = "employee name can't be left empty")
	@Column(name="email")
	private String email;
	
	@NotEmpty(message = "Must not be Empty and NULL")
	@NotBlank(message = "employee name can't be left empty")
	@Column(name="phone_number")
	private String phoneNumber;
	
	 @JsonInclude(Include.NON_EMPTY)
	@NotEmpty(message = "Must not be Empty and NULL")
	@NotBlank(message = "employee name can't be left empty")
	@Column(name="DOJ")
	private String DOJ;
	
	 @JsonInclude(Include.NON_EMPTY)
	@NotEmpty(message = "Must not be Empty and NULL")
	@NotBlank(message = "employee name can't be left empty")
	@Column(name="Salary")
	private double Salary;
	
	 @JsonInclude(Include.NON_EMPTY)
	@Column(name="taxAmount")
	private double taxAmount;
	
	
	 @JsonInclude(Include.NON_EMPTY)
	@Column(name="yearlySalary")
	private double yearlySalary;

	public double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public double getYearlySalary() {
		return yearlySalary;
	}

	public void setYearlySalary(double yearlySalary) {
		this.yearlySalary = yearlySalary;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDOJ() {
		return DOJ;
	}

	public void setDOJ(String dOJ) {
		DOJ = dOJ;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", phoneNumber=" + phoneNumber + ", DOJ=" + DOJ + ", Salary=" + Salary + "]";
	}
	
	
	
	
	
}
