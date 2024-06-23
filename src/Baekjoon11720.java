package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int sum = 0;

				/*
					char을 바로 int로 형변환 시키면 아스키코드 값이 되므로
					String으로 먼저 형변환 후 int로 형변환 시켜줘야한다.
				*/
        for(int i=0;i<n;i++) {
            char c = s.charAt(i);
            sum += Integer.parseInt(String.valueOf(c));
        }

        System.out.println(sum);
    }
}
