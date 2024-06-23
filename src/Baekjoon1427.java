package src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class Baekjoon1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // ""를 기준으로 문자열을 쪼개서 배열을 만들어준다.
        String[] n = br.readLine().split("");
        // String 배열을 내림차순 정렬하는 방법이다.
        Arrays.sort(n, Collections.reverseOrder());
        for(int i=0;i<n.length;i++) {
            bw.write(n[i]);
        }
        bw.flush();
        bw.close();
    }
}
