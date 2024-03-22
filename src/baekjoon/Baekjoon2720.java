package baekjoon;

import java.io.*;
public class Baekjoon2720 {
    public static void main(String[] args) throws IOException {
        // 쿼터
        int q = 25;
        // 다임
        int d = 10;
        // 니켈
        int n = 5;
        // 페니
        int p = 1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuffer sb;

        for(int i=0;i<t;i++) {
            int c = Integer.parseInt(br.readLine());
            sb = new StringBuffer();
            sb.append(c/q + " ");
            c%=q;
            sb.append(c/d + " ");
            c%=d;
            sb.append(c/n + " ");
            c%=n;
            sb.append(c/p);

            System.out.println(sb.toString());
        }
    }
}
