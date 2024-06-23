package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        // n값
        int n = Integer.parseInt(br.readLine());
        // 반복문으로 n/4번만큼 long 추가
        for(int i=0;i<n/4;i++) {
            sb.append("long");
            sb.append(" ");
        }
        sb.append("int");
        System.out.println(sb.toString());
    }
}
