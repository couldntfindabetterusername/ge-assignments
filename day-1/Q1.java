import java.util.Random;
import java.util.Scanner;

class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of times to flip the coin: ");
        int numFlips = scanner.nextInt();

        int heads = 0;
        int tails = 0;
        Random random = new Random();

        while (numFlips > 0) {
            if (random.nextDouble() < 0.5) {
                tails++;
            } else {
                heads++;
            }

            numFlips--;
        }

        int totalFlips = heads + tails;

        double percentageHeads = (heads * (1.0)) / totalFlips * 100;
        double percentageTails = (tails * (1.0)) / totalFlips * 100;

        System.out.println("Percentage of Heads: " + percentageHeads);
        System.out.println("Percentage of Tails: " + percentageTails);

        scanner.close();
    }
}