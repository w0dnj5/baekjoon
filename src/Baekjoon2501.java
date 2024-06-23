package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Baekjoon2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        // 자연수 N
        int n = Integer.parseInt(st.nextToken());
        // K 번째 약수
        int k = Integer.parseInt(st.nextToken());

        // 제곱근을 기준으로 계산하면 절반만 나누면 된다.
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
                // 중복 방지를 위해 n이 i이 제곱이 아닐때만 n/i 값을 추가한다. ex) 4 * 4 = 16
                if (i * i != n) {
                    list.add(n / i);
                }
            }
        }
        // 추가한 약수들을 정렬해준다.
        Collections.sort(list);

        // k가 약수 수보다 큰 수면 0을 출력
        if(list.size() < k) {
            System.out.println(0);
        }
        else {
            System.out.println(list.get(k-1));
        }
    }
}
