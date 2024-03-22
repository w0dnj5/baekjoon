package baekjoon;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Baekjoon2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] alphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String s = br.readLine();
        // contains(문자열) 메소드를 통해서 해당 문자열 존재 여부 확인
        for(int i=0;i<alphabet.length;i++) {
            // 존재하면 문자열을 공백으로 변경 (한 문자로 취급)
            if(s.contains(alphabet[i])) {
                s = s.replace(alphabet[i], " ");
            }
        }
        // 문자열 길이 출력
        System.out.println(s.length());
    }
}
