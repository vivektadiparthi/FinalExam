/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author Sai Vivek Reddy Tadiparthi
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ArrayList<Employee> e=new ArrayList<Employee>();  
    e.add(new Employee(4,"David",14500));    
    e.add(new Employee(3,"Kane",7840));
    e.add(new Employee(1,"Mike",56000));
    e.add(new Employee(2,"Jonny",92000));
    e.add(new Employee(5,"Maxwell",8000));
    System.out.println("Final Exam");
    System.out.println("Vivek tadiparthi");
    System.out.println("Question 12");
    System.out.println("The original list is :");
        for(Employee em:e){ 
            System.out.println(em.toString()); 
	} 
    System.out.println("List after sorting with employee id :");
    Collections.sort(e);  
	for(Employee em:e){  
            System.out.println(em.toString());
	}  
    System.out.println("List after sorting with salary :");
    Collections.sort(e, (Employee e1, Employee e2) -> Double.compare(e1.getEmpSalary(), e2.getEmpSalary()));
    for(Employee em:e){  
	System.out.println(em.toString());
	}  
    System.out.println("List after sorting with employee name :");
    Collections.sort(e, (Employee e1, Employee e2) -> e1.getEmpName().compareTo(e2.getEmpName()));
    for(Employee em:e){  
	System.out.println(em.toString());
	}  

    }

}