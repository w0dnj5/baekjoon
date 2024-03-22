package baekjoon;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Baekjoon1157 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toUpperCase();
        int[] alphabet = new int[26];
        // 해당하는 순서의 알파벳 배열의 값을 +1 해준다.
        for(int i=0;i<s.length();i++) {
            alphabet[s.charAt(i)-'A']++;
        }

        int max = 0;
        char answer = '?';
        for(int i=0;i<alphabet.length;i++) {
            // max보다 크면 해당 알파벳의 갯수를 max로 바꿔주고 해당 알파벳을 답으로 설정
            if(alphabet[i] > max) {
                max = alphabet[i];
                answer = (char)(i + 'A');
            }
            // 만약 최댓값이 같은 알파벳이 있으면 답을 ?로 변경
            else if(alphabet[i]==max) {
                answer = '?';
            }
        }
        System.out.println(answer);
    }
}
