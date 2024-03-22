package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Baekjoon2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb;
        int t = Integer.parseInt(br.readLine());

        // 테스트 케이스만큼 반복
        for(int i=0;i<t;i++) {
            st = new StringTokenizer(br.readLine(), " ");
            sb = new StringBuffer();
            // 문자 반복 횟수
            int r = Integer.parseInt(st.nextToken());
            // 문자열
            String s = st.nextToken();
            // 각 문자를 r번씩 반복
            for(int j=0;j<s.length();j++) {
                for(int k=0;k<r;k++) {
                    sb.append(s.charAt(j));
                }
            }
            // 출력
            System.out.println(sb.toString());
        }
    }
}
