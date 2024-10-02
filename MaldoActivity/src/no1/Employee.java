package no1;

public class Employee {
    String name;
    int performanceScore;
    int salary;

    
    public Employee(String name, int performanceScore, int salary) {
        this.name = name;
        this.performanceScore = performanceScore;
        this.salary = salary;
    }

    
    @Override
    public String toString() {
        return name + ": Score: " + performanceScore + ", Salary: " + salary;
    }
}

