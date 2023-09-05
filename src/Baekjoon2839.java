import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<=n/3;i++) {
            for(int j=0;j<=n/5;j++) {
                if(i*3 + j*5 == n) {
                    System.out.println(i+j);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}
