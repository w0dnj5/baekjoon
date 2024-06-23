package src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Baekjoon10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        String[] a = br.readLine().split(" ");

        for(int i=0;i<n;i++) {
            String tmp = a[i];
            if(x > Integer.parseInt(tmp)) {
                bw.write(tmp + " ");
            }
        }
        bw.flush();
        bw.close();
    }
}
