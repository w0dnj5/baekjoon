package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Baekjoon15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int l = Integer.parseInt(br.readLine());
        String input = br.readLine();
        BigInteger sum = new BigInteger("0");
        for (int i = 0; i < l; i++) {
            BigInteger tmp = BigInteger.valueOf(input.charAt(i) - '`');
            sum = sum.add(tmp.multiply(BigInteger.valueOf(31).pow(i)));
        }

        BigInteger result = sum.mod(BigInteger.valueOf(1234567891));
        bw.write(result.toString());
        bw.flush();
        bw.close();
    }
}
