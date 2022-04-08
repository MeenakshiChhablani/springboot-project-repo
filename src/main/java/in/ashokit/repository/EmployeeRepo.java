package in.ashokit.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.ashokit.entities.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Serializable>  /*<>Employee, Integer(datatype of primary key)*/
{
 
 /*  public Employee findByEmpName(String name);   //writing abstract method 
    
	public List<Employee> findByEmpSal(Integer sal); //give double  //this is for is we have multiple record with same name 
	
	//select * from emp_tbl where emp_name="Krishna" and emp_sal=3000 ;
	public List<Employee>  findByEmpNameAndEmpSal(String name, Integer sal);
	
	
	//select * from emp_tbl where emp_sal > 15000;
	public List<Employee> findByEmpSalGreaterThan (Integer salary);
	
	//select * from emp_tbl where emp_name in ('Ram' , 'Sia ');
	public List<Employee> findByEmpNameIn(List<String> name);*/
	
	
	//NOw These All Are Custom Queries
	@Query("select empSal from Employee where empName=:name ")
	public Integer findEmpSalByEmpName(String name);  //based on the name i want salary 
	
	@Query("from Employee where empName=:name")
	public List<Employee> findByEmpName(String name);
	
	@Query("select empName , empSal from Employee where empId =: id ")
	public List<Employee> findByEmpNameAndEmpSal( Integer id );
}
