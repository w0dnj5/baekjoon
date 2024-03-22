package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon4948 {

    public static boolean prime(int number) {
        if(number == 0 || number == 1) {
            return false;
        }
        for(int i = 2; i * i <= number; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n;
        do {
            n = Integer.parseInt(br.readLine());
            if(n == 0) {
                break;
            }
            int count = 0;
            for(int i = n+1; i <= n * 2; i++) {
                if(prime(i)) {
                    count++;
                }
            }
            bw.write(count+"\n");
        } while(true);
        bw.flush();
        bw.close();
    }
}
