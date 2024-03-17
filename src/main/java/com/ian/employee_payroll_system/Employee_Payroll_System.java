package com.ian.employee_payroll_system;

import java.util.Scanner;

/**
 *
 * @author Ian Tagano
 */



public class Employee_Payroll_System 
{

    public static void main(String[] args) 
    {
        Payroll_System theSystem = new Payroll_System();    //create new instance of the Payroll_system
        Scanner scanner = new Scanner(System.in);
        
        int choice;
        
        do
        {
            System.out.println("\nEmployee Payroll System Menu:");
            System.out.println("1. Add New Employee");
            System.out.println("2. Calculate Bonus");
            System.out.println("3. Display Employee Information");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch(choice)
            {
                case 1:
                    theSystem.addEmployee();
                    break;
                    
                case 2:
                    theSystem.calculateBonus();
                    break;
                    
                case 3:
                    theSystem.displayEmployeeInfo();
                    break;
                    
                case 4:
                    System.out.println("Exiting system program.");
                    break;
                    
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }     
        } while(choice != 4);
       
        
        
    }
}
