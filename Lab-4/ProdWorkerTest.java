/**
 * Production Worker Test
 * 
 * Demonstrate the classes by writing a program that uses a ProductionWorker object.
 * 
 */

 import java.util.Scanner;

 public class ProdWorkerTest {
     public static void main(String[] args) throws InvalidEmployeeNumber {
         String name;
         String employeeNumber;
         String hireDate;
         int shift;
         double payRate;

         System.out.printf("Hello%nWelcome to the employee database.%nPlease add a new employee%n");

         //collect employee information
         Scanner input = new Scanner(System.in);
         System.out.print("Please enter their name: ");
         name = input.next();

         System.out.print("Please enter the employee number: ");
         employeeNumber = input.next();

         System.out.print("Please enter the hire date(YYYY-MM-DD): ");
         hireDate = input.next();

         System.out.print("Please enter their shift: ");
         shift = input.nextInt();

         System.out.print("Please enter their pay rate: ");
         payRate = input.nextDouble();

         ProductionWorker emp = new ProductionWorker(name, employeeNumber, hireDate, shift, payRate);

         //employee number check
         String[] numberSplit = emp.getEmployeeNumber().split("-", 2);
         char letter = numberSplit[1].charAt(0);
         int ascii = (int) letter;
         if(Integer.parseInt(numberSplit[0]) > 999) {
            emp.setEmployeeNumber("Not valid");
         }
         else if(ascii < 65 || ascii > 77) {
            emp.setEmployeeNumber("Not valid");
         }

         //employee shift check
         if(emp.getShift() < 1 || emp.getShift() > 2) {
            throw new ArithmeticException("Not a valid shift");
        }

        //employee pay rate check
        if(emp.getPayRate()< 0.00) {
            throw new ArithmeticException("Not a valid pay rate");
         }

         System.out.printf("The employee just entered:%n%s", emp.toString());
     }
 }