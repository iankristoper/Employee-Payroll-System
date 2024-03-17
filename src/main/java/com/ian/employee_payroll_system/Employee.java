package com.ian.employee_payroll_system;

/**
 *
 * @author Ian Tagano
 */


public class Employee 
{
    //private attributes for data hiding 
    private String name;
    private double salary;
    private double bonusRate;
    
    public Employee(String name, double salary, double bonusRate)
    {
        this.name = name;
        this.salary = salary;
        this.bonusRate = bonusRate;
    }
    
    
    //this is the getter methods 
    public String getName() {
        return name;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public double getBonueRate() {
        return bonusRate;
    }
    
    
    //this is the setter methods 
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void setBonusRate(double bonusRate) {
        this.bonusRate = bonusRate;
    }
    
    public double calculateBonus(double bonusRate) {
        return salary * bonusRate;
    }
    
    
    //
    @Override 
    public String toString()
    {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", bonusRate=" + bonusRate +
                '}';
    }
    
    
}
