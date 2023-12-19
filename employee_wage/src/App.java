public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to employee wage builder");

        int attendance = Math.random() > 0.5 ? 1 : 0;

        if(attendance == 1){
            System.out.println("Employee is present");
        }else{
            System.out.println("Employee is absent");
            return;
        }

        int WAGE_PER_HOUR = 20;
        int EMP_HRS = 8;

        int empWage = EMP_HRS * WAGE_PER_HOUR;

        System.out.println(empWage);
    }
}
