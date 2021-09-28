/**
 * Production Worker
 * 
 * Write a class named ProductionWorker that extends the Employee class. The ProductionWorker class should have fields to hold the following information:
 * 
 *  - Shift (an integer)
 *  - Hourly pay rate (a double)
 * 
 * The workday is divided into two shifts: day and night. The shift field will be an integer value representing the shift that the employee works. The day shift is shift 1 and the night shift is shift 2.
 * Write one or more constructors and the appropriate accessor and mutator methods for the class. Demonstrate the classes by writing a program that uses a ProductionWorker object.
 */

 public class ProductionWorker extends Employee {
     private int shift;
     private double hourlyPayRate;

     //constructor
     public ProductionWorker(String employeeName, String employeeNumber, String employeeHireDate, int shift, double payRate) {
         super(employeeName, employeeNumber, employeeHireDate);
         this.shift = shift;
         this.hourlyPayRate = payRate;
     }

     //accessors
     public int getShift() { return shift; }
     public double getPayRate() { return hourlyPayRate; }

     //mutators
     public void setShift(int shift) {
         this.shift = shift;
     }

     public void setPayRate(double payRate) {
         this.hourlyPayRate = payRate;
     }

     @Override
     public String toString() {
         return String.format("%s%nShift: %d%nHourly Pay Rate: $%.2f", super.toString(), getShift(), getPayRate());
     }
 }