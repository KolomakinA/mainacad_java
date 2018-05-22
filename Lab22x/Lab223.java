package com.company.Lab22x;

public class Lab223 {
    public static void main(String[] args) {
        Accountant accountant = new Accountant();
        accountant.doMath();
    }
}

class Employee{
    void calcSalary(String name, double ... salaryArray){
        double totalSalary = 0;
        for (double salaryUnit:salaryArray) {
            totalSalary += salaryUnit;
        }
        System.out.println(String.format("%s has earned %s in total", name, totalSalary));
    }
}

class Accountant{
    private Employee employee;
    Accountant(){
        this.employee = new Employee();
    }

    void doMath(){
        employee.calcSalary("John Shmoe", 57.5, 6854.98, 587.27, 68765.10, 66, 387.99,686.03);
        employee.calcSalary("Peter Goe", 587.14, 784.01, 5798.2, 1785.51, 66.66, 3587.99, 0686.03);
    }
}
