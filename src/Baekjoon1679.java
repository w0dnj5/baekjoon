import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Baekjoon1679 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        BigInteger integer = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            integer = integer.multiply(new BigInteger(String.valueOf(i)));
        }
        int c = 0;
        String result = integer.toString();
        for (int j = result.length() - 1; j >= 0; j--) {
            if (result.charAt(j) == '0') {
                c++;
                continue;
            }
            break;
        }
        bw.write(String.valueOf(c));
        bw.flush();
        bw.close();
    }
}
