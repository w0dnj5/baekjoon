package baekjoon;

import java.io.*;
public class Baekjoon2292 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // i : 한 바퀴가 끝나는 부분
        int i = 1;
        // cnt : 지나가는 횟수
        int cnt = 1;

        // i가 num보다 작으면 한 바퀴를 추가
        while(n > i) {
            i += 6*cnt;
            cnt++;
        }

        System.out.println(cnt);
        br.close();
    }
}
