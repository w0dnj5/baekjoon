package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        // 입력 받은 문자를 저장할 2차원 배열을 생성
        String[][] arr1 = new String[n][m];
        String[][] arr2 = new String[n][m];
        // 1 ~ n번쨰를 배열 형식으로 arr1[][] 저장
        for(int i=0;i<n;i++) {
            arr1[i] = br.readLine().split(" ");
        }

        for(int i=0;i<n;i++) {
            arr2[i] = br.readLine().split(" ");
        }

        StringBuffer sb = new StringBuffer();

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                int x = Integer.parseInt(arr1[i][j]);
                int y = Integer.parseInt(arr2[i][j]);
                sb.append(x+y);
                sb.append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }

}
