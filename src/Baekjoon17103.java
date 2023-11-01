import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon17103 {

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
        // 소수 구하는 알고리즘 : 에라토스테네스의 체
        boolean[] numbers = new boolean[1000001];
        numbers[0] = numbers[1] = true;
        for(int i = 0 ; i * i <= 1000000 ; i++) {
            if(!numbers[i]) {
                for(int j = i + i; j <= 1000000; j+=i) {
                    numbers[j] = true;
                }
            }
        }

        int t = Integer.parseInt(br.readLine());
        while(t != 0) {
            int count = 0;
            int n = Integer.parseInt(br.readLine());
            for(int i = 2; i <= n/2; i++) {
                if(!numbers[i] && prime(n - i)) {
                    count++;
                }
            }
            bw.write(count+"\n");
            t--;
        }
        bw.flush();
        bw.close();
    }
}
