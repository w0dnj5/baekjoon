package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer(br.readLine());
        // StringBuffer의 .reverse() 메소드로 문자열을 뒤집는다.
        StringTokenizer st = new StringTokenizer(sb.reverse().toString());

        int b = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int r;
        // a > b면 a, a < b면 b를 출력
        if(a > b) { r = a; }
        else { r = b; }

        System.out.println(r);
    }
}
