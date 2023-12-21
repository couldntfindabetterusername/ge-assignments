import java.util.ArrayList;
import java.util.Scanner;

public class Company {
    static Scanner scanner = new Scanner(System.in);

    public String companyName;
    public ArrayList<Employee> employees;
    public int wagePerHour;
    public int workingDaysPerMonth;
    public int workingHoursPerMonth;

    Company() {
        employees = new ArrayList<Employee>();
    }

    Company(String companyName, ArrayList<Employee> employees, int wagesPerHour, int workingDaysPerMonth,
            int workingHoursPerMonth) {
        this.companyName = companyName;
        this.employees = employees;
        this.wagePerHour = wagesPerHour;
        this.workingDaysPerMonth = workingDaysPerMonth;
        this.workingHoursPerMonth = workingHoursPerMonth;
    }

    public void makeCompany() {
        this.companyName = getStringInp();
        this.employees = getListInp();
        this.wagePerHour = getIntInp("Enter the wage per hour: ");
        this.workingDaysPerMonth = getIntInp("Enter the working days per month: ");
        this.workingHoursPerMonth = getIntInp("Enter the working hours per month: ");

    }

    private static String getStringInp() {
        System.out.println("Enter the company name: ");
        return scanner.nextLine();
    }

    private static ArrayList<Employee> getListInp() {
        System.out.println("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();

        ArrayList<Employee> employeeList = new ArrayList<Employee>();

        for (int i = 0; i < numEmployees; i++) {
            ;

            Employee employee = new Employee();
            employeeList.add(employee);
        }

        return employeeList;
    }

    private static int getIntInp(String prompt) {
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public void displayCompany() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Number of Employees: " + employees.size());
        System.out.println("Wage Per Hour: " + wagePerHour);
        System.out.println("Working Days Per Month: " + workingDaysPerMonth);
        System.out.println("Working Hours Per Month: " + workingHoursPerMonth);
    }

    public void calcDailyWage() {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("Daily Wage of Employee " + (i + 1) + ": " + employees.get(i).dailyWage(wagePerHour));
        }
    }

    public void calcMonthlyWage() {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("Monthly Wage of Employee " + (i + 1) + ": "
                    + employees.get(i).monthlyWage(wagePerHour, workingDaysPerMonth, workingHoursPerMonth));
        }
    }
}
