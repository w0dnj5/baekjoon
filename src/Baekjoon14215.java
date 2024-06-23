package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon14215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] triangle = new int[3];
        int r = 0;
        for(int i=0;i<3;i++) {
            triangle[i] = Integer.parseInt(st.nextToken());
        }
        // 최대값을 구하기 위한 정렬
        Arrays.sort(triangle);

        // 기존 세 변으로 삼각형이 성립이 되지 않을 떄 가장 긴 변 - (가장 긴 변 - 나머지 두 변의 합 + 1)으로 삼각형이 성립되는 변의 길이로 변경해준다.
        if(triangle[2] >= triangle[0] + triangle[1]) {
            triangle[2] -= (triangle[2] - (triangle[0] + triangle[1])) + 1;
        }

        // 재설정한 세 변의 합을 구해준다.
        for(int i=0;i<3;i++) {
            r+= triangle[i];
        }
        // 출력
        System.out.println(r);
    }
}
