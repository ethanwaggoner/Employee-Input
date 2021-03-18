import java.util.*; // Imports the utilities

/**
 * Author: Ethan Waggoner
 * Date: 3/08/2021
 * Program Summary: Allows for the input of employee data and returns the data as well as the lowest and highest salaries
 * File: Project.java
 **/

public class Project {

    // Initializes the lists that hold employee data
    public static List<String> nameList = new ArrayList<>();
    public static List<Integer> idList = new ArrayList<>();
    public static List<Double> salaryList = new ArrayList<>();

    public static void load() {

        Scanner scan = new Scanner(System.in); // initializes the scanner

        System.out.println("How many employees would you like to enter?");

        int numberOfEmployees = scan.nextInt();

        // iterates over the number of employees
        for (int i = 1; i <= numberOfEmployees; i++) {

            System.out.println("Employee " + i);
            System.out.println("Enter Employee's Name:");

            String employeeName = scan.next();

            System.out.println("Enter the employee's id number:");

            int employeeID = scan.nextInt();

            System.out.println("Please enter the employee's salary:");

            double employeeSalary = scan.nextDouble();

            // Gets the number of digits in the employeeID
            int numDigits = String.valueOf(employeeID).length();

            // Verifies that the employeeID is 5 digits long
            if (numDigits == 5) {

                // Adds the inputted data to the lists
                nameList.add(employeeName);
                idList.add(employeeID);
                salaryList.add(employeeSalary);

            } else {

                System.out.println("Invalid ID. Please try again.");

            }

        }

    }

    /* Adds a new employee and their data */
    public static void add() {

        Scanner scan = new Scanner(System.in); // initializes the scanner

        System.out.println("Enter Employee's Name:");

        String employeeName = scan.next();

        System.out.println("Enter the employee's id number:");

        int employeeID = scan.nextInt();

        System.out.println("Please enter the employee's salary:");

        double employeeSalary = scan.nextDouble();

        // Gets the number of digits in the employeeID
        int numDigits = String.valueOf(employeeID).length();

        // Verifies that the employeeID is 5 digits long
        if (numDigits == 5) {

            // Adds the inputted data to the lists
            nameList.add(employeeName);
            idList.add(employeeID);
            salaryList.add(employeeSalary);

            System.out.println("Employee information added.");

        } else {

            System.out.println("Invalid ID. Please try again.");

        }

    }

    /* displays all entered employee information */
    public static void display() {

        for (int i = 0; i <= nameList.size() - 1; i++) {

            System.out.println("Name: " + nameList.get(i) + " ID: " + idList.get(i) + " Salary: " + salaryList.get(i));
            System.out.println("");

        }

    }

    /* Retrieves specific employee data based on the entered employee ID */
    public static void retrieve() {

        Scanner scan = new Scanner(System.in); // initializes the scanner

        System.out.println("Please enter the ID of the employee you wish to retrieve:");

        int employeeID = scan.nextInt();

        int index = idList.indexOf(employeeID); // Gets the index of the entered ID

        // Outputs data based on index
        System.out.println("ID: " + idList.get(index) + " Name: " + nameList.get(index) + " Salary: " +
                salaryList.get(index));

    }

    /* Prints employee information based on inputted salary range */
    public static void salary() {

        Scanner scan = new Scanner(System.in); // initializes the scanner

        System.out.println("Please enter the Highest and the Lowest salary separated by a space:");

        double highest = scan.nextDouble();
        double lowest = scan.nextDouble();

        for (int i = 0; i <= salaryList.size() - 1; i++ ) { // iterates over salaryList

            // compares to see if the salary is within the desired range
            if ((salaryList.get(i) >= lowest) & (salaryList.get(i) <= highest)) {

                // Outputs the employee information within the salary range
                System.out.println("Name: " + nameList.get(i) + " ID: " + idList.get(i) +" Salary " +
                        salaryList.get(i));


            }

        }

    }

    /* Main creates the menu */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // initializes the scanner

        boolean isContinue = true;

        while (isContinue) {

            // Displays the menu
            System.out.println("----------------------------------------------------");
            System.out.println("Press 1 to load employee data");
            System.out.println("Press 2 to add an employee");
            System.out.println("Press 3 to display information for all employees");
            System.out.println("Press 4 to retrieve a specific employee's data");
            System.out.println("Press 5 to list employee data based on salary range");
            System.out.println("Press 6 to exit");
            System.out.println("----------------------------------------------------");

            int choice = scan.nextInt(); // Holds the user's choice as an integer

            if (choice == 1) {

                load();

            } else if (choice == 2) {

                add();

            } else if (choice == 3) {

                display();

            } else if (choice == 4) {

                retrieve();

            } else if (choice == 5) {

                salary();

            } else if (choice == 6) {

                System.out.println("Exiting the program...");
                isContinue = false; // breaks the loop

            } else {

                System.out.println("Incorrect input. Please try again");

            }

        }

    }

}
