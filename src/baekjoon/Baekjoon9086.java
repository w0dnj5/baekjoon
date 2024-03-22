package baekjoon;

import java.util.Scanner;
public class Baekjoon9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String result;
        int cnt = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<cnt;i++) {
            String s = sc.nextLine();
            result = s.charAt(0) + "" + s.charAt(s.length()-1);
            System.out.println(result);
        }
    }
}
