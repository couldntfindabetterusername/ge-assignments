public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to employee wage builder");

        int attendance = Math.random() > 0.5 ? 1 : 0;

        switch(attendance){
            case 1: System.out.println("Employee is present");
                break;

            default: System.out.println("Employee is absent");
                return;
        }

        int isFullTime = Math.random() > 0.5 ? 1 : 0;
        
        int WAGE_PER_HOUR = 20;
        int EMP_HRS = 0;

        switch(isFullTime){
            case 1: System.out.println("Employee is fulltime");
                EMP_HRS = 8;
                break;

            default: System.out.println("Employee is parttime");
                EMP_HRS = 4;
                break;
        }

        int empWage = EMP_HRS * WAGE_PER_HOUR;

        System.out.println("Wage of the employee is: " + empWage);
    }
}
