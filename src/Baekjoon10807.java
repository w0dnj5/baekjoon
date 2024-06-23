package src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon10807
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 정수의 개수
        int n = Integer.parseInt(br.readLine());
        // 정수 split() 함수로 " "을 기준으로 나눠서 배열로 만들어준다.
        String[] arr = br.readLine().split(" ");
        // 찾으려는 정수
        int v = Integer.parseInt(br.readLine());
        // 찾으려는 정수 갯수
        int cnt = 0;

        for(int i=0;i<n;i++) {
            if(v==Integer.parseInt(arr[i])) {
                cnt++;
            }
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();

        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 정수의 개수는 필요 없으므로 스킵한다.
		br.readLine();
		// 정수
		String n = br.readLine();
		// 찾으려는 정수
		String v = br.readLine();
		// 찾으려는 정수 갯수
		int cnt = 0;

		StringTokenizer st = new StringTokenizer(n, " ");
		// 토큰이 없을 때까지 토큰을 하나씩 v 같은 지 비교하기
		while(st.hasMoreTokens()) {
			if(v.equals(st.nextToken())) { cnt++; }
		}
		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();
        */
    }
}
