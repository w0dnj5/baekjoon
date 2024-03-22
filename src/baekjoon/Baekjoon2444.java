package baekjoon;

import java.util.Scanner;
public class Baekjoon2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        int i=0, j=0, k=0;

        for(i=1;i<=cnt;i++) {
            for(j=i;j<cnt;j++) {
                System.out.print(" ");
            }
            for(k=2*i-1;k>0;k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=cnt-1;i>0;i--) {
            for(j=i;j<cnt;j++) {
                System.out.print(" ");
            }
            for(k=2*i-1;k>0;k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
