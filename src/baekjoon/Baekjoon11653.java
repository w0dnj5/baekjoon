package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if(n!=1) {
            for(int i=2;i<=n;i++) {
                if(n%i == 0) {
                    n = n/i;
                    System.out.println(i);
                    i--;
                }
            }
        }
    }
}
