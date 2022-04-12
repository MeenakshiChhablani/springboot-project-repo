package in.ashokit.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//@Data
@Entity
@Table(name="EMP_TBL")
public class Employee {

	int 10;
public Employee() {
		System.out.println("EmployeeEntity class constructor");
	}

public Employee(Integer empId, String empName, Integer empSal) {
		
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}


	@Id
	@Column(name="EMP_ID")
	private Integer empId;
	
	
	@Column(name="EMP_NAME")
	private String empName;
	
	@Column(name="EMP_SAL")
	private Integer empSal;
	
	//{in place of creating getter and setters user Lambok}
	
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpSal(Integer empSal) {
		this.empSal = empSal;
	}

	
	@Override
	public String toString() {
		return "EmployeeEntity [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

	
}
