package com.employee.data.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.data.model.Employee;
import com.employee.data.repository.EmployeeRepository;

// employee service class
@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	// fetching all employees
	public List<Employee> getAllEmployees(){
		List<Employee> emps = (List<Employee>)employeeRepository.findAll(); 
		
		List<Employee> empList= new ArrayList<>();
		
		for(Employee emp: emps) {
			empList.add(calculateTotalTax(emp));
		}
		
		return empList;
	}
	
	// fetching employee by id
	public Employee calculateTotalTax(Employee e) {
		
List<Employee> employees= new ArrayList<>();
		
employees= employeeRepository.findAll();
		
        double totalTax = employees.stream()
                .mapToDouble(employee -> calculateTax(employee.getSalary()*12))
                .sum();
Employee e1 =new Employee();
      e1.setTaxAmount(totalTax);
      e1.setYearlySalary(e.getSalary()*12);
      e1.setFirstName(e.getFirstName());
      e1.setLastName(e.getLastName());
      e1.setEmployeeID(e.getEmployeeID());
      
      return e1;
    }

    public static double calculateTax(double income) {
        double tax = 0.0;
        if (income <= 250000) {
            // No tax
            tax = 0.0;
        } else if (income <= 500000) {
            // 5% tax for income over ₹250,000 and up to ₹500,000
            tax = (income - 250000) * 0.05;
        } else if (income <= 1000000) {
            // 10% tax for income over ₹500,000 and up to ₹1,000,000
            tax = 12500 + (income - 500000) * 0.1;
        } else {
            // 20% tax for income over ₹1,000,000
            tax = 112500 + (income - 1000000) * 0.2;
        }
        return tax;
    }
	
	// inserting employee
	public void addEmployee(Employee e) {
		employeeRepository.save(e);
	}
	
	
	
	
	
	
}
