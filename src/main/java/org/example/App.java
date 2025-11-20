package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers to display in the loop? ");
        int n = scanner.nextInt();

        String result = getNumbersString(n);
        System.out.println(result);
    }

    public static String getNumbersString(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello and welcome!\n");
        for (int i = 1; i <= n; i++) {
            sb.append("i = ").append(i).append("\n");
        }
        return sb.toString();
    }
}
