package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Baekjoon24313 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());
        int i = 0;
        // 조건에서 a1, a0 범위가 0<= |a| <= 100 으로 정의했다. 그리고 n보다 큰 수들이 다 성립을 해야하므로 a1이 c보다 크면 예외가 발생한다.
        if(a1 <= c && a1 * n0 + a0 <= c * n0) {
            i = 1;
        }
        System.out.println(i);
    }
}
