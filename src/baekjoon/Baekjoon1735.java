package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon1735 {

    public static final int NUMBER_OF_NUMBERS = 2;

    public static int gcd(int a, int b) {
        int tmp;
        while(b > 0) {
            tmp = a;
            a = b;
            b = tmp%b;
        }
        return a;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] fraction1 = new int[NUMBER_OF_NUMBERS];
        int[] fraction2 = new int[NUMBER_OF_NUMBERS];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < NUMBER_OF_NUMBERS ; i++) {
            fraction1[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < NUMBER_OF_NUMBERS ; i++) {
            fraction2[i] = Integer.parseInt(st.nextToken());
        }

        int denominator = fraction1[1] * fraction2[1] / gcd(fraction1[1], fraction2[1]);
        int numerator = (fraction1[0] * (denominator/fraction1[1])) + (fraction2[0] * (denominator/fraction2[1]));

        int fractionGcd = gcd(denominator, numerator);
        bw.write(String.valueOf(numerator/fractionGcd));
        bw.write(" ");
        bw.write(String.valueOf(denominator/fractionGcd));
        bw.flush();
        bw.close();
    }
}
