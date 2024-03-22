package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon15894 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // 왜 4를 곱하는지는 문제 도형을 보는게 좀 더 이해하기 좋을 거 같다...
        // n의 범위가 10^9이므로 4를 곱했을 때 int 범위를 초과한다. 따라서 long으로 형변환 시켜서 출력한다.
        System.out.println((long) n * 4);
    }
}
