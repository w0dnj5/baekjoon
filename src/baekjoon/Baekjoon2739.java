package baekjoon;

import java.io.*;
public class Baekjoon2739 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력 받은 값
        int num = Integer.parseInt(br.readLine());

        // 구구단 출력
        for(int i=1;i<10;i++) {
            int result = num*i;
            System.out.println(num + " * " + i + " = " + result);
        }
    }
}
