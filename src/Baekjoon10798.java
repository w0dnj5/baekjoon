package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] arr = new String[5][];
        // 입력 받는 문자열의 길이가 일정하지 않으므로 배열 안에 배열을 넣는 2차원 배열을 만든다.
        for(int i=0;i<5;i++) {
            arr[i] = br.readLine().split("");
        }

        StringBuffer sb = new StringBuffer();
				/*
					세로로 문자열을 출력해야하는데 배열 안에 배열의 길이가 일정하지 않으므로
					조건의 문자열 최대 길이인 15로 설정하고 배열의 길이보다 작은 조건에서만 문자를
					추가하도록 설정
				*/
        for(int i=0;i<15;i++) {
            for(int j=0;j<5;j++) {
                if(i < arr[j].length) {
                    sb.append(arr[j][i]);
                }
            }
        }
        System.out.println(sb.toString());
    }
}
