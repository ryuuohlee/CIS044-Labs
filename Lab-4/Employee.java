/**
 * Employee
 * 
 * Design a class called Employee. The class should have the following fields:
 * 
 *  - Employee name
 *  - Employee number in the format XXX-L, where each x is a digit within the range 0-9 and theL is a letter within the range A-M.
 *  - Hire date
 * 
 * Write one or more constructors and the appropriate accessor and mutator methods for the class. 
 */

 public abstract class Employee {
     private String employeeName;
     private String employeeNumber;
     private String employeeHireDate;

     //contructor
     public Employee(String name, String employeeNumber, String hireDate) {
         this.employeeName = name;
         this.employeeNumber = employeeNumber;
         this.employeeHireDate = hireDate;
     }

     //accessors
     public String getName() { return employeeName; }
     public String getEmployeeNumber() { return employeeNumber; }
     public String getHireDate() { return employeeHireDate; }

     //mutators
     public void setName(String name) {
         this.employeeName = name;
     }

     public void setEmployeeNumber(String employeeNo) {
        this.employeeNumber = employeeNo;
     }

     public void setEmployeeHireDate(String hireDate) {
         this.employeeHireDate = hireDate;
     }

     @Override
     public String toString() {
         return String.format("%s%nEmployee Number: %s%nHire Date: %s", getName(), getEmployeeNumber(), getHireDate());
     }
 }