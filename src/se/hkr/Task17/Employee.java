package se.hkr.Task17;

public class Employee {
     public String firstName;
     public String lastName;
     public double salary;
     public String department;


         public Employee(String firstName, String lastName, double salary, String department) {
             this.firstName = firstName;
             this.lastName = lastName;
             this.salary = salary;
             this.department = department;
             }

         // get firstName
         public String getFirstName() {
             return firstName;
             }

         // get lastName
         public String getLastName() {
             return lastName;
             }

         // get salary
         public double getSalary() {
             return salary;
             }

         // get department
         public String getDepartment() {
             return department;
             }

         // return Employee's first and last name combined
         public String getName() {
             return String.format("%s %s", getFirstName(), getLastName());
             }

         // return a String containing the Employee's information
         @Override
         public String toString() {
             return String.format("%-8s %-8s %8.2f %s",
                     getFirstName(), getLastName(), getSalary(), getDepartment());
            }
}
