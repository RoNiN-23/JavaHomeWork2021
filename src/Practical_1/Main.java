package Practical_1;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        Comparator <Integer> comparator = (a,b) -> a.compareTo(b);
        if(comparator.compare(Math.abs(num1),Math.abs(num2)) > 0)
            System.out.println("|" + num1 + "| > |" + num2 + "|");
        if(comparator.compare(Math.abs(num1),Math.abs(num2)) < 0)
            System.out.println("|" + num1 + "| < |" + num2 + "|");
        if(comparator.compare(Math.abs(num1),Math.abs(num2)) == 0)
            System.out.println("|" + num1 + "| = |" + num2 + "|");
    }
}
