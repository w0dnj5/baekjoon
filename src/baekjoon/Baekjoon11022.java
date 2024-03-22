package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
public class Baekjoon11022 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // T 값
        int t = Integer.parseInt(br.readLine());
        // 반복문 T번 반복
        for(int i=0;i<t;i++) {
            // A, B 값
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            String result = String.valueOf(a + b);
            bw.write("Case #" + (i+1) + ": " + a + " + " + b + " = " + result + "\n");
        }
        bw.flush();
        bw.close();
    }
}
