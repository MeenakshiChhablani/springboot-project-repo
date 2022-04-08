package in.ashokit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entities.Employee;
import in.ashokit.repository.EmployeeRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	     
		EmployeeRepo empRepo=context.getBean(EmployeeRepo.class);
/*		
	Employee findByEmpName = empRepo.findByEmpName("Radha"); 
//this if for, if we have only 1 record with that name but we have multiple record with same then go for list concept 
		System.out.println(findByEmpName);
		
		
		List<Employee> findByEmpSal = empRepo.findByEmpSal(3000);
		System.out.println(findByEmpSal);
		
		List<Employee> findByEmpNameAndEmpSal = empRepo.findByEmpNameAndEmpSal("Sia", 21000);
		System.out.println(findByEmpNameAndEmpSal);
		
		
		List<Employee> findByEmpSalGreaterThan = empRepo.findByEmpSalGreaterThan(15000);
		System.out.println(findByEmpSalGreaterThan);
		
		List<Employee> findByEmpNameIn = empRepo.findByEmpNameIn(Arrays.asList("Sia","Ram"));
		findByEmpNameIn.forEach( listArray ->
		{
			System.out.println(listArray);
			}   );*/
	
		
		Integer salary = empRepo.findEmpSalByEmpName("Krishna");
        System.out.println("Salary :"+salary);      
		
		
		/*
		List<Employee> byName = empRepo.findByEmpName("Krishna");
		System.out.println(byName);          */
		
		List<Employee> findByEmpNameAndEmpSal = empRepo.findByEmpNameAndEmpSal(106);
		System.out.println(findByEmpNameAndEmpSal);
	}  
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
}
