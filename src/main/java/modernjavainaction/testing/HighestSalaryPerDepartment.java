package modernjavainaction.testing;

import java.util.*;
import java.util.stream.Collectors;

public class HighestSalaryPerDepartment {


  static class Employee {
    String name;
    String department;
    double salary;

    public Employee(String name, String department, double salary) {
      this.name = name;
      this.department = department;
      this.salary = salary;
    }

    public String getDepartment() {
      return department;
    }

    public double getSalary() {
      return salary;
    }
  }

  public static void main(String[] args) {
    List<Employee> employees = Arrays.asList(
        new Employee("Alice", "IT", 70000),
        new Employee("Bob", "HR", 50000),
        new Employee("Charlie", "IT", 90000),
        new Employee("David", "HR", 60000),
        new Employee("Eve", "Finance", 80000));

    // Complete the function using Streams get the highest salary by department

    //Collectors.maxBy(Comparator.comparing(Employee::getSalary)),

    Map<String, Employee> highestPaidEmployees = employees.stream()
      .collect(Collectors.groupingBy(
        Employee::getDepartment,
        Collectors.collectingAndThen(
          Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
          Optional::get)
        )
      );

    highestPaidEmployees
        .forEach((dept, emp) -> System.out.println(dept + " -> " + emp.name + " (" + emp.salary + ")"));
  }
}

