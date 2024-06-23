package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon24266 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println((long)n*n*n);
        // 최고차항만 남기게되면 시간 복잡도는 O(n^3)가 된다.
        System.out.println(3);
    }
}
