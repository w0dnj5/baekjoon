package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
public class Baekjoon25304 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 품목 계산 결과
        int result = 0;
        // x 값
        int x = Integer.parseInt(br.readLine());
        // n 값
        int n = Integer.parseInt(br.readLine());
        // 반복문
        while (n != 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            result += a * b;
            n--;
        }

        if (result == x) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
