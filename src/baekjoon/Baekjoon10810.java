package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Baekjoon10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 바구니 개수
        int n = Integer.parseInt(st.nextToken());
        // 조건 수
        int m = Integer.parseInt(st.nextToken());
        // 바구니 개수 길이의 배열 생성
        int[] basket = new int[n];

        for(int i=0;i<m;i++) {
            st = new StringTokenizer(br.readLine());
            // 공을 넣을 바구니 범위
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            // 바구니에 넣을 숫자
            int c = Integer.parseInt(st.nextToken());
            // 반복문 실행 (배열은 index가 0부터 시작이지만 바구니는 1번째부터 이므로 -1을 해준다.)
            for(int j=a-1;j<b;j++) {
                basket[j] = c;
            }
        }
        // 결과값 출력
        StringBuffer sb = new StringBuffer();

        for(int k=0;k<basket.length;k++) {
            sb.append(basket[k]);
            sb.append(" ");
        }

        System.out.println(sb.toString());
    }
}
