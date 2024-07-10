package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 피보나치 함수 문제
public class Baekjoon1003 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        for(int i = 0; i < c; i++) {
            int N = Integer.parseInt(br.readLine());
            System.out.println(find(N));
        }

        // fibonacci(2) -> fibonacci(1), fibonacci(0) // 1 1
        // fibonacci(3) -> fibonacci(1), fibonacci(0), fibonacci(1) // 2 1
        // fibonacci(4)
        // -> fibonacci(3), fibonacci(2)
        // -> fibonacci(2), fibonacci(1), fibonacci(1), fibonacci(0)
        // -> fibonacci(1), fibonacci(0), fibonacci(1), fibonacci(1), fibonacci(0) // 3 2
        // fibonacci(5)
        // -> fibonacci(4), fibonacci(3)
        // -> fibonacci(3), fibonacci(2), fibonacci(2), fibonacci(1)
        // -> fibonacci(2), fibonacci(1), fibonacci(1), fibonacci(0), fibonacci(1), fibonacci(0), fibonacci(1)
        // -> fibonacci(1), fibonacci(0), fibonacci(1), fibonacci(1), fibonacci(0), fibonacci(1), fibonacci(0), fibonacci(1) // 5 3

        // 0 -> 0 1
        // 1 -> 1 0
        // 2 -> 1 1
        // 3 -> 2 1
        // 4 -> 3 2
        // 5 -> 5 3
        // 6 -> 8 5

        // 또 다른 피보나치 수열이 완성이 된다!
    }

    public static String find(int N) {
        // N + 1개 배열 안에 0 1의 개수를
        int[][] arr = new int[N + 1][2];
        if(N >= 0) {
            arr[0][0] = 1;
            arr[0][1] = 0;
        }
        if(N >= 1) {
            arr[1][0] = 0;
            arr[1][1] = 1;
        }
        for(int i = 2 ; i < N + 1; i++) {
            arr[i][0] = arr[i - 1][0] + arr[i - 2][0];
            arr[i][1] = arr[i - 1][1] + arr[i - 2][1];
        }
        return arr[N][0] + " " + arr[N][1];
    }
}