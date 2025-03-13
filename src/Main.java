import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);
    static ArrayList<String[]> empMPH = new ArrayList<>();
    static EmployeeModel employeeModel = new EmployeeData();
    static SalaryCalculations sd = new SalaryCalculations();
	
    public static void main(String[] args) {
	        if (!login()) {
	            System.out.println("Too many failed attempts. Exiting...");
	            return;
	        }

	        while (true) {
	            System.out.println("\n=== Welcome to Employee Management System ===");
	            System.out.println("1. View Employee Masterlist");
	            System.out.println("2. Salary Details");
	            System.out.println("3. Net Salary Calculation");
	            System.out.println("4. Exit");
	            System.out.print("Select an option: ");
				String choice = scanner.nextLine();

	            switch (choice) {
	                
	                case "1":
	                    viewEmployees();
	                    break;
	                case "2":
	                	salaryDetails();
	                	break;
	                case "3":
	                	netSalaryCalulation();
	                	break;
	                default:
	                    System.out.println("Invalid option! Try again.");   
	            }
	        }
		}
	




private static boolean login() {
    final String USERNAME = "admin";
    final String PASSWORD = "1234";
    
    System.out.println("****************************");
	System.out.println("**** Welcome to MotorPH ****");
	System.out.println("****************************");
	
    for (int i = 3; i > 0; i--) {
        System.out.print("Enter username: ");
        String user = scanner.nextLine();
        System.out.print("Enter password: ");
        String pass = scanner.nextLine();

        if (user.equals(USERNAME) && pass.equals(PASSWORD)) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Incorrect credentials. Attempts left: " + (i - 1));
        }
    }
    return false;
}



private static void viewEmployees() {
	Employee[] employees =  employeeModel.getEmployeeModelList();
	 
	 System.out.println("***********************************************");
     System.out.println("**                MotorPH                    **");
     System.out.println("**            List of employees              **");
     System.out.println("***********************************************");
     
     for (int a = 0; a < employees.length; a++) {
         Employee employee = employees[a];
         System.out.print("Emp ID: "+ employee.getEmpNo() + ", Employee Name: " + employee.getLastName()
                 + " " + employee.getFirstName()
                 + ", Position: " + employee.getPosition() + "\n");
     
     }
}

private static void salaryDetails() {
	Employee[] employees =  employeeModel.getEmployeeModelList();
	System.out.println("***********************************************");
    System.out.println("**           Employee Basic Salary           **");
    System.out.println("**                 Details                   **");
    System.out.println("***********************************************");
    System.out.println("*****Enter Employee ID or Last Name: ");
    String input = scanner.nextLine();

    boolean found = false;
    for (Employee emp : employees) {
        if (emp.getEmpNo().equalsIgnoreCase(input) || emp.getLastName().equalsIgnoreCase(input)) {
            System.out.println("Employee: " + emp.getLastName() + " , " + emp.getFirstName()); 
            System.out.println("Position: " + emp.getPosition());
            System.out.println("Hourly Rate: " + emp.getHourlyRate() );
            System.out.println("Basic Salary:  " + emp.getBasicSalary());
            System.out.println("Gross Weekly Salary: " + sd.grossWeeklySalary(emp.getHourlyRate()));
            System.out.println("Gross Monthly Salary: " + sd.grossMonthlySalary(emp.getHourlyRate()));
        	found = true;
        	break;
        	}
    	}

    	if (!found) {
        System.out.println("Employee not found.");
    	}
    
    
	
}
	
private static void netSalaryCalulation() {
	Employee[] employees =  employeeModel.getEmployeeModelList();
	System.out.println("***********************************************");
    System.out.println("**           Employee Net Salary             **");
    System.out.println("**             After Deductions              **");
    System.out.println("***********************************************");
    System.out.print("*****Enter Employee ID or Last Name: ");
    String input = scanner.nextLine();
    
    boolean found = false;
    for (Employee emp : employees) {
        if (emp.getEmpNo().equalsIgnoreCase(input) || emp.getLastName().equalsIgnoreCase(input)) {
            System.out.println("Enter number of Total Hours worked: ");
            double hours = scanner.nextDouble();
            double salary = sd.salaryPerHoursWorked(hours, emp.getHourlyRate());
        	System.out.println("Employee: " + emp.getLastName() + " , " + emp.getFirstName());
        	System.out.println("Position: " + emp.getPosition());
        	System.out.println("Total salary based on total Hours worked: " + salary);
            System.out.println("SSS Deductions        : " + sd.sssDeduction(salary));
            System.out.println("Witholding Tax        : " + sd.getWithholdingTax(salary));
            System.out.println("PagIBIG deductions    : " + sd.getPagibigDeduction(salary));
            System.out.println("PhilHealth deductions : " + sd.getPhilHealthDeduction(salary));
            System.out.println("**** NET SALARY ****");
            System.out.println("**** " + (salary - sd.getTotalDeductions(salary)) + " ****");
            found = true;
            break;
        		}      	
    		}

    	if (!found) {
        System.out.println("Employee not found.");
    	}
	}
} 



