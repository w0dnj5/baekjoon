package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Baekjoon1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // .countTokens()를 통해 토큰이 몇 개인지 출력한다.
        System.out.println(st.countTokens());

        /*
        Scanner sc = new Scanner(System.in);

		int cnt = 0;
		String s;
		// strip() 메소드를 통해 앞뒤 공백을 제거해준다.
		s = sc.nextLine().strip();
		if(s.length() != 0) {
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i) == ' ') {
					cnt++;
				}
			}
			cnt++;
		}
		System.out.println(cnt);
		*/
    }
}
