import java.util.Scanner;

public class TimeChecker {
    public static boolean WhatTimeIsIt(int number) {
        int hours = number / 100;
        int minutes = number % 100;
        return (hours >= 0 && hours <= 23) && (minutes >= 0 && minutes <= 59);
    }

    public static void YesOrNo(int number, int n) {
        if (WhatTimeIsIt(number)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number: ");
            int x = scanner.nextInt();
            YesOrNo(x, n);
        }
    }
}
