package baekjoon;

import java.io.*;
public class Baekjoon8393 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int sum = 0;

        // 반복문
        for(int i=1;i<=num;i++)
            sum += i;

        System.out.println(sum);
    }
}
