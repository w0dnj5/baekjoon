package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Baekjoon2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 최대값
        int max = 0;
        // 몇 번째
        int index = 0;

        for(int i=1;i<10;i++) {
            // 입력을 하나씩 받아서 비교 (조건이 자연수이므로 0보다 작은 수는 존재 x)
            int n = Integer.parseInt(br.readLine());
            if(max < n) {
                max = n;
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
// 1차원 배열 문제인데 배열이 굳이 필요한지 잘 모르겠다…ㅎㅎ