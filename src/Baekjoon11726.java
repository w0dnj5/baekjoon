package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon11726 {

    public static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new int[n + 1];
        System.out.println(topDown(n));
        /*
        dp[1] = 1;
        if(n >= 2) { // n = 1이면 dp[2] 접근 시 ArrayIndexOutOfBounds 에러 발생...
            dp[2] = 2;
        }
        bottomUp(n);
        System.out.println(dp[n]);
        */
    }

    // Bottom-up
    public static void bottomUp(int n) {
        for(int i = 3; i < n + 1; i++) {
            // 40번째 정도에서 실제 답이 int 범위를 벗어나 오버플로우로 인해 오차 발생... 따라서 연산할 때마다 나눠줘야함
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10_007;
        }
    }

    // Top-down
    public static int topDown(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(dp[n] != 0) return dp[n];
        dp[n] = (topDown(n - 1) + topDown(n - 2)) % 10_007;
        return dp[n];
    }
}