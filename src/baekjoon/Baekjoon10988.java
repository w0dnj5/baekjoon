package baekjoon;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Baekjoon10988 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int l = s.length();
        int r = 1;

        for(int i=0;i<l;i++) {
            // 문자 맨 처음부터 ++
            char c1 = s.charAt(i);
            // 문자 맨 마지막부터 --
            char c2 = s.charAt((l-1)-i);
            // 좌우 대칭이 하나라도 아니면 0으로 바꿔준다.
            if(c1!=c2) {
                r = 0;
            }
        }
        System.out.println(r);
    }
}
