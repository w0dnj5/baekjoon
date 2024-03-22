package baekjoon;

import java.io.*;
import java.util.*;

public class Baekjoon1934 {

    public static int gcd(int a, int b) {

        if(b == 0) {
            return a;
        }
        else {
            return gcd(b, a%b);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 유클리드 호제법 : x * y = (x, y의 최대공약수) * (x, y의 최소공배수)
        // 따라서 x, y의 최소공배수 = (x * y) / (x, y의 최대공약수)
        int t = Integer.parseInt(br.readLine());
        // 첫 번째 수
        int a;
        // 두 번째 수
        int b;
        // 최대공약수
        int c;
        StringTokenizer st;

        int n;
        for(int i=0;i<t;i++) {
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken()); // 입력 받은 첫 번째 값
            b = Integer.parseInt(st.nextToken()); // 입력 받은 두 번째 값

            if(b == 0) {
                c = a;
            }
            else {
                c = gcd(a, b);
            }

            bw.write(a*b/c + "\n");
        }
        // 출력
        bw.flush();
        bw.close();
    }
}
