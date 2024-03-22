package baekjoon;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Baekjoon10926 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        // str를 + 연산을 하면 문자열끼리 합쳐진다.
        System.out.println(str + "??!");
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuffer를 통해 입력값을 받아온다.
        StringBuffer st = new StringBuffer(br.readLine());
        // append("문자열")을 통해 기존 문자열에 "??!"를 붙여준다.
        st.append("??!");
        // StringBuffer를 toString() 메소드를 통해 String 형식으로 출력해준다.
        System.out.println(st.toString());
         */
    }
}
