import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String[]> empMPH = new ArrayList<>();
    static EmployeeModel employeeModel = new EmployeeData();
    static SalaryCalculations sd = new SalaryCalculations();

    public static void main(String[] args) {
        if (!login()) { // Dislay an error message if the login method returns false (meaning authentication failed)
            System.out.println("Too many failed attempts. Exiting...");
            return; // Stop execution if login fails
        }

        // Infinite loop to keep displaying the menu until the user chooses to exit
        while (true) {
            System.out.println("\n=== Welcome to Employee Management System ===");
            System.out.println("1. View Employee Masterlist");
            System.out.println("2. Salary Details");
            System.out.println("3. Net Salary Calculation");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            String choice = scanner.nextLine();

            switch (choice) { // Evaluate user's choice

                case "1":
                    viewEmployees();
                    break;
                case "2":
                    salaryDetails();
                    break;
                case "3":
                    netSalaryCalulation();
                    break;
                case "4": // Exit the loop and terminate the program
                    System.out.println("Closing Program ...");
                    return;
                default:
                    System.out.println("Invalid option! Try again."); // Handle invalid inputs
            }
        }
    }

    // Method for admin login process
    private static boolean login() {
        final String USERNAME = "admin";
        final String PASSWORD = "1234";

        // Header for login promt
        System.out.println("****************************");
        System.out.println("**   Welcome to MotorPH   **");
        System.out.println("**      ADMIN LOGIN       **");
        System.out.println("****************************");

        // loop for 3 attempts
        for (int i = 3; i > 0; i--) {
            // Prompt user for username and password input
            System.out.print("Enter username: ");
            String user = scanner.nextLine();
            System.out.print("Enter password: ");
            String pass = scanner.nextLine();

            // Check if the entered credentials match the username and password
            if (user.equals(USERNAME) && pass.equals(PASSWORD)) {
                System.out.println("Login successful!");
                return true;
            } 
            
            else { // Display remaining attempts if login fails
                System.out.println("Incorrect credentials. Attempts left: " + (i - 1));
            }
        }
        return false;
    }

    // Method to view list of employees
    private static void viewEmployees() {
        Employee[] employees = employeeModel.getEmployeeModelList();

        // Header for the employee list section
        System.out.println("***********************************************");
        System.out.println("**                MotorPH                    **");
        System.out.println("**            List of employees              **");
        System.out.println("***********************************************");

        // Iterate through the employee list and display each employee's details
        for (int a = 0; a < employees.length; a++) {
            Employee employee = employees[a];
            // Print the employee's details, including ID, name, position, and birthdate
            System.out.print("Emp ID: " + employee.getEmpNo() + ", Employee Name: " + employee.getLastName()
                    + " " + employee.getFirstName()
                    + ", Position: " + employee.getPosition() + ", Date of Birth:  " + employee.getBirthday() + "\n");

        }
    }

    // Method to view salary details of employees
    private static void salaryDetails() {
        Employee[] employees = employeeModel.getEmployeeModelList();

        // Header for salary details of employees section
        System.out.println("***********************************************");
        System.out.println("**           Employee Basic Salary           **");
        System.out.println("**                 Details                   **");
        System.out.println("***********************************************");

        // Prompt the user to enter an Employee ID or Last Name
        System.out.println("*****Enter Employee ID or Last Name: ");
        String input = scanner.nextLine();

        boolean found = false;
        for (Employee emp : employees) {
            // Check if the entered input matches the Employee ID or Last Name (case-insensitive)
            if (emp.getEmpNo().equalsIgnoreCase(input) || emp.getLastName().equalsIgnoreCase(input)) {
                // Display salary details of employees
                System.out.println("Employee: " + emp.getLastName() + " , " + emp.getFirstName());
                System.out.println("Position: " + emp.getPosition());
                System.out.println("Hourly Rate: " + emp.getHourlyRate());
                System.out.println("Basic Salary:  " + emp.getBasicSalary());
                System.out.println("Gross Weekly Salary: " + sd.grossWeeklySalary(emp.getHourlyRate()));
                System.out.println("Gross Monthly Salary: " + sd.grossMonthlySalary(emp.getHourlyRate()));
                found = true;
                break;
            }
        }

        // Display an error message, if no employee is found
        if (!found) {
            System.out.println("Employee not found.");
        }

    }

    // Method to calculate net salary of employees
    private static void netSalaryCalulation() {
        Employee[] employees = employeeModel.getEmployeeModelList();

        // Header the net salary calculation section
        System.out.println("***********************************************");
        System.out.println("**           Employee Net Salary             **");
        System.out.println("**             After Deductions              **");
        System.out.println("***********************************************");

        // Prompt the user to enter an Employee ID or Last Name
        System.out.print("*****Enter Employee ID or Last Name: ");
        String input = scanner.nextLine();

        boolean found = false;
        for (Employee emp : employees) {
            // Check if the entered input matches either the employee ID or last name (case-insensitive)
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
                
                // Display the net salary
                System.out.println("**** NET SALARY ****");
                System.out.println("**** " + (salary - sd.getTotalDeductions(salary)) + " ****");
                found = true;
                break;
            }
        }

        // Display an error message, if no employee is found
        if (!found) {
            System.out.println("Employee not found.");
        }
    }
}
