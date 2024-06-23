package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 알파벳 개수 : 26
        int alphabet = 26;
        int[] arr = new int[alphabet];
        String s = br.readLine();
        // 배열을 -1로 전부 채워준다.
        for(int i=0;i<alphabet;i++) {
            arr[i] = -1;
        }
				/*
					0번째부터 a라고 했을 때 char에서 - 'a'를 해주면 몇 번째 알파벳인지 인지 알 수 있다.
					ex) 'z'-'a' = 25 (122 - 97 = 25);

					해당 배열의 값이 -1이면 배열 안의 값을 문자의 인덱스값으로 바꿔준다.
				*/
        for(int i=0;i<s.length();i++) {
            int n = s.charAt(i) - 'a';
            if(arr[n]==-1) {
                arr[n] = i;
            }
        }

        StringBuffer sb = new StringBuffer();
        for(int i=0;i<arr.length;i++) {
            sb.append(arr[i]);
            sb.append(" ");
        }

        System.out.println(sb.toString());
    }
}
