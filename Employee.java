
package wagesmanagementsystem;

import java.util.ArrayList;

public class Employee extends Person{
   private Salary empSalary;
   //Arraylist of garments handled by employee
   private ArrayList<Garment> garments = new ArrayList();

   //constructor of employee
    public Employee(String name, String id, long salary) {
        super(name, id);
        
        empSalary = new EmployeeSalary(salary);
    }
   
    //method to add garments to the list
   public void addGarment(Garment g) {
       garments.add(g);
   }
   
   //method to calculate employee salary
    public double calculateSalary() {
        return empSalary.getSalary()*0.8+(empSalary.getSalary()/10);
    }
    
    //getter setter for variables
    public void setSalary(long salary){
        empSalary.setSalary(salary);
    }
    public int garmentsSold(){
        return garments.size();
    }
    @Override
    public String getName(){
        return super.getName();
    }
    
   
}
