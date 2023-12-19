public class App {
    public static int workingHoursADay(){
        int attendance = Math.random() > 0.5 ? 1 : 0;

        if(attendance == 0){
            return 0;
        }

        int isFullTime = Math.random() > 0.5 ? 1 : 0;
        int empHrs = 0;

        switch(isFullTime){
            case 1: empHrs = 8;
                break;

            default: empHrs = 4;
                break;
        }

        return empHrs;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to employee wage builder");

        int WAGE_PER_HOUR = 20;
        
        int empHrs = 0;

        int NUM_DAYS = 20;

        int empDays;
        for(empDays = 1; empDays <= NUM_DAYS; empDays++){
            empHrs += workingHoursADay();
            if(empHrs > 100){
                empHrs = 100;
                break;
            }
        }

        int empWage = empHrs * WAGE_PER_HOUR;

        System.out.println("Employee has worked for " + (empDays-1) + " days and " + empHrs + " hours.");
        System.out.println("Monthly wage of the employee is: " + empWage);
    }
}
