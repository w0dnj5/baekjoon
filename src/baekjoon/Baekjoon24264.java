package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon24264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 시간복잡도가 O(n^2)이므로 최고차항의 차수는 2이다.
        // 입력 받는 범위가 1<= n <= 500,000 이므로 500,000^2는 int 범위를 초과하므로 long으로 형변환 시켜준다.
        System.out.println((long)n*n);
        System.out.println(2);
    }
}
