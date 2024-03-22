package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Baekjoon10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        // 바구니에 숫자를 넣어 준다.
        int[] basket = new int[n];
        for(int a=0;a<n;a++) {
            basket[a] = a+1;
        }

        for(int b=0;b<m;b++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k;

            k = basket[i-1];
            basket[i-1] = basket[j-1];
            basket[j-1] = k;
        }

        StringBuffer sb = new StringBuffer();
        for(int x : basket) {
            sb.append(x);
            sb.append(" ");
        }

        System.out.println(sb.toString());
    }
}
