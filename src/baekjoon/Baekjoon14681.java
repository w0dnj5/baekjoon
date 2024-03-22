package baekjoon;

import java.io.*;
public class Baekjoon14681 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        // 1사분면 조건
        if(x > 0 && y > 0)
            bw.write("1");
            // 2사분면 조건
        else if(x < 0 && y > 0)
            bw.write("2");
            // 3사분면 조건
        else if(x < 0 && y < 0)
            bw.write("3");
            // 4사분면 조건
        else
            bw.write("4");
        bw.flush();
        bw.close();
    }
}
