package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon30802 {

    public static void main(String[] args) throws IOException {
        // 같은 사이즈의 T장 묶음으로만 주문 가능 (남아도 됨)
        // 펜은 P자루 or 한 자루씩 주문 가능 (남거나 부족하면 안됨)
        // 첫 번째 줄 : 구매해야하는 티셔츠 묶음 개수 출력
        // 두 번째 줄 : 구매해야하는 펜 묶음 수와 낱개 개수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 참가자 수
        int n = Integer.parseInt(br.readLine());
        // 티셔츠는 S, M, L, XL, XXL, XXXL 6가지 사이즈
        int[] shirts = new int[6];
        // 총 인원 수
        int sTotal = 0;
        // 사이즈 별 티셔츠 개수 입력 받음
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 6; i++) {
            shirts[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        // 한 묶음 당 티셔츠 개수
        int t = Integer.parseInt(st.nextToken());
        // 한 묶음 당 펜 개수
        int p = Integer.parseInt(st.nextToken());

        // 사이즈 별 티셔츠 묶음 개수
        int[] counts = new int[6];

        for(int i = 0; i < 6; i++) {
            counts[i] = shirts[i] / t;
            if(shirts[i] % t > 0) {
                counts[i]++;
            }
        }

        for(int i = 0; i < 6; i++) {
            sTotal+=counts[i];
        }

        System.out.println(sTotal);
        System.out.println(n / p + " " + n % p);

    }
}
