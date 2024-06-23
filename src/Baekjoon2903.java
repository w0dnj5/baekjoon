package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Baekjoon2903 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // 처음 정사각형 한 변의 점 개수 : 2개
        int x = 2;
        // 2 x 2일 때 점 4개, 3 x 3일 때 점 9개, 5 x 5 일 때 점 25개 이므로
        for(int i=0;i<n;i++) {
            x = x+(x-1);
        }

        System.out.println(x*x);
    }
}
