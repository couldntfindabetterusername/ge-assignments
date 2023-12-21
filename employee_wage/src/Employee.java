import java.util.Scanner;

public class Employee {
    private static Scanner scanner = new Scanner(System.in);
    private static final int FULLTIME_HRS = 8;
    private static final int PARTTIME_HRS = 4;

    public String name;

    Employee(String name) {
        this.name = name;
    }

    Employee() {
        this(getInput());
    }

    private static String getInput() {
        System.out.println("Enter the employee name: ");
        return scanner.nextLine();
    }

    private int checkAttendance() {
        int attendance = Math.random() > 0.5 ? 1 : 0;
        return attendance;
    }

    private int isFullTime() {
        int isFullTime = Math.random() > 0.5 ? 1 : 0;
        return isFullTime;
    }

    private int calcWorkingHrs() {
        int checkAttendance = checkAttendance();

        if (checkAttendance == 0)
            return 0;

        int isFullTime = isFullTime();
        int workingHours = 0;

        if (isFullTime == 1)
            workingHours = FULLTIME_HRS;
        else
            workingHours = PARTTIME_HRS;

        return workingHours;
    }

    public int dailyWage(int wagePerHour) {
        int workingHours = calcWorkingHrs();

        int wage = workingHours * wagePerHour;
        return wage;
    }

    public int monthlyWage(int wagePerHour, int workingDaysPerMonth, int workingHoursPerMonth) {

        int workingHours = 0;
        for (int i = 1; i < workingDaysPerMonth; i++) {
            workingHours += calcWorkingHrs();
            if (workingHours > workingHoursPerMonth) {
                workingHours = workingHoursPerMonth;
                break;
            }

        }

        int monthlyWage = workingHours * wagePerHour;
        return monthlyWage;

    }
}