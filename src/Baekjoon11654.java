package src;

import java.util.Scanner;

public class Baekjoon11654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for(int i=0;i<s.length();i++) {
            // char를 int로 형변환 시켜주면 아스키코드 값이 나온다
            char c = s.charAt(i);
            System.out.print((int)c);
        }
    }
}
