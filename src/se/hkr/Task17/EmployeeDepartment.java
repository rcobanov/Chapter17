package se.hkr.Task17;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeDepartment {
    public static void main(String[] args) {
        Employee robin = new Employee("Robin","Cobanov",32500,"Developers");
        Employee fredrik = new Employee("Fredrik", "Wetterlöv", 22000, "Developers");
        Employee gavin = new Employee("Gavin", "Belson", 330000, "Manager");
        Employee dumbledore = new Employee("Albus","Dumbledore",50,"Accountant");
        Employee snape = new Employee("Severus","Snape", 25, "Accountant");

        List<Employee> empList = new ArrayList<>();
        empList.add(robin);
        empList.add(fredrik);
        empList.add(gavin);
        empList.add(dumbledore);
        empList.add(snape);

        Map<String, List<Employee>> groupedByDepartment = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        groupedByDepartment.forEach((department, employeesinDepartment) ->{
            double total = employeesinDepartment.stream().mapToDouble(Employee::getSalary).sum();
            double average = total / empList.size();
            System.out.format("%-10s --> %8.2fkr%n", department, average);
        });



    }
}
