// package classwork;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int numTimes = n;

            while (numTimes >= 0) {
                if (i > 1 && i < n && numTimes > 0 && numTimes < n) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

                numTimes--;
            }

            System.out.println();
        }

        scanner.close();
    }
}
