package no1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;



public class EmployeeSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        List<Employee> employees = new ArrayList<>();

        
        System.out.print("Enter the number of employees: ");
        int numberOfEmployees = scanner.nextInt();
        scanner.nextLine(); 

        
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Performance Score: ");
            int performanceScore = scanner.nextInt();

            System.out.print("Salary: ");
            int salary = scanner.nextInt();
            scanner.nextLine(); 


            employees.add(new Employee(name, performanceScore, salary));
        }


        Collections.sort(employees, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {

                if (e1.performanceScore != e2.performanceScore) {
                    return Integer.compare(e2.performanceScore, e1.performanceScore);
                }
               
                return Integer.compare(e2.salary, e1.salary);
            }
        });

      
        System.out.println("\nSorted Employee List:");
        for (Employee e : employees) {
            System.out.println(e);
        }

       
    }
}

