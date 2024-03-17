package com.ian.employee_payroll_system;

//packages to be used in the system
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ian Tagano
 */

public class Payroll_System 
{
    private List<Employee> employees;   //declare private List with the type of Employee as blueprint
    private Scanner scanner;            //declare scanner in private 
    
    //constructor method
    public Payroll_System()
    {
        this.employees = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }
    
    
    //method for adding employee
    public void addEmployee()
    {
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        
        System.out.println("Enter employee salary: ");
        double salary = Double.parseDouble(scanner.nextLine());
        
        System.out.println("Enter employee bonus rate: ");
        double bonusRate = Double.parseDouble(scanner.nextLine());
        
        Employee employee = new Employee(name, salary, bonusRate);
        employees.add(employee);
        System.out.println("Employee added successfully");
        
    }
    
    
    //
    public void calculateBonus()
    {
        if(employees.isEmpty())
        {
            System.out.println("No employee on the system.");
            return;
        }
        
        System.out.print("Enter bonus percentage: ");
        double percentage = scanner.nextDouble();
        
        for(Employee employee : employees)
        {
            double bonus = employee.calculateBonus(percentage);
            System.out.print("Bonus for " + employee.getName() + ": $" + bonus);
        }
    }
    
    
    public void displayEmployeeInfo()
    {
        if(employees.isEmpty())
        {
            System.out.println("No employee in the system");
            return;
        }
        
        
    }
}
