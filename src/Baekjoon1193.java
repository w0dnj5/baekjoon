package src;

import java.util.Scanner;

public class Baekjoon1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = Integer.parseInt(sc.nextLine());
        int sum = 0;
        int count = 1;

        while (true) {
            System.out.println("sum : " + sum + "\ncount : " + count);
            if (X <= sum + count) {
                if (X % 2 == 1) {
                    System.out.println(count - (X - sum - 1) + " / " + (X - sum));
                    break;
                }
                if (X % 2 == 0) {
                    System.out.println((X - sum) + " / " + (count - (X - sum - 1)));
                    break;
                }
            } else {
                sum += count;
                count++;
            }
        }

    }
}
