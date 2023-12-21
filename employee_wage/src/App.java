
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Company> companies = new ArrayList<Company>();

    public static void utilityMethod(String method) {
        System.out.print("Enter company: ");
        String companyName = scanner.next();

        for (int i = 0; i < companies.size(); i++) {
            if (companies.get(i).companyName.equals(companyName)) {

                switch (method) {
                    case "display":
                        companies.get(i).displayCompany();
                        break;

                    case "daily-wage":
                        companies.get(i).calcDailyWage();
                        break;

                    case "monthly-wage":
                        companies.get(i).calcMonthlyWage();
                        break;

                    default:
                        break;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to employee wage builder");

        int option;

        do {
            System.out.println("--------------------------");
            System.out.println("Enter 1 to build new company");
            System.out.println("Enter 2 to display a company's detalis");
            System.out.println("Enter 3 to calculate daily wages of each employee of a company");
            System.out.println("Enter 4 to calculate monthly wages of each employee of a company");
            System.out.println("Enter 5 to exit");
            System.out.println("--------------------------");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    Company company = new Company();
                    company.makeCompany();
                    companies.add(company);
                    break;

                case 2:
                    utilityMethod("display");
                    break;

                case 3:
                    utilityMethod("daily-wage");
                    break;
                case 4:
                    utilityMethod("monthly-wage");
                    break;
                case 5:
                    option = 0;
                    break;
                default:
                    System.out.println("Enter a valid number");
                    break;
            }
        } while (option != 0);

    }
}
