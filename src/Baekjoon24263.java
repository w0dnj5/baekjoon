package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon24263 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // 빅오표기법으로 시간복잡도가 O(n)이므로 최고차항의 차수는 1 n번 반복하므로 입력 받은 횟수를 출력해주면 된다.
        System.out.println(n);
        System.out.println(1);
    }
}
