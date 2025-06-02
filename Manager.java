
package wagesmanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

//manager is a subclass of person(abstract class)
public class Manager extends Person{
    
    Scanner cin = new Scanner(System.in);
    private Salary managerSalary;
    //arraylist of employees
    private ArrayList<Employee> employees = new ArrayList();

    //constructor 
    public Manager(String name, String id, long salary) {
        super(name, id);
        managerSalary = new ManagerSalary(salary);
    }
    
    //method to add employee
    public void addEmployee(Employee e){
        employees.add(e);
    }
    
    //method to add employee
    public Employee searchEmployee(String username){
        String search;
        boolean found = false;
        search = cin.nextLine();
        for(int i=0; i < employees.size(); i++){
            if(employees.get(i).getName() == search){
                found = true;
                System.out.println("Found!");
                return employees.get(i);
            }
        }
        if(found == false){
            System.out.println("Not found.");
        }
        return employees.get(0);
    }
    
    //getters and setters 
       public double getSalary() {
        return managerSalary.getSalary()*0.8 +(managerSalary.getSalary()/10);
    }
    
    public void setSalary(long salary){
        managerSalary.setSalary(salary);
    }
    @Override
    public String getName(){
        return super.getName();
    }
    
    
}
