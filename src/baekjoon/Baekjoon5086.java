package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        boolean flag = true;
        int x;  // 첫 번쨰 수
        int y;  // 두 번째 수

        while(flag) {
            st = new StringTokenizer(br.readLine(), " ");
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            if(x!=0 && y!=0) {
                if (x < y && y % x == 0) {  // x가 y의 약수일 때 조건
                    System.out.println("factor");
                } else if (x > y && x % y == 0) { // x가 y의 배수일 때 조건
                    System.out.println("multiple");
                } else { // 그 외의 경우
                    System.out.println("neither");
                }
            }
            else {
               flag = false;
            }
        }
    }
}
