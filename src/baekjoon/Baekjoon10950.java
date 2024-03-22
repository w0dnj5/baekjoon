package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
public class Baekjoon10950 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 반복 횟수
        int cnt = Integer.parseInt(br.readLine());

        // 반복문
        while(cnt != 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            // 결과 출력
            System.out.println(a+b);
            cnt--;
        }
    }
}
