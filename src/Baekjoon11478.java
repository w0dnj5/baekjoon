package src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Baekjoon11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        Set<String> set = new HashSet<>();

        // 모든 문자열의 경우 수로 잘라준다.
        for(int i=0;i<s.length();i++) {
            // substring(0, 1) ~ substring(s.length(), s.length()+1) 까지 전부
            for(int j=i+1;j<s.length()+1;j++) {
                // 집합에 추가되면 중복이 자동 제거 된다.
                set.add(s.substring(i,j));
            }
        }

        bw.write(String.valueOf(set.size()));
        bw.flush();
        bw.close();
    }
}