package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 과목 개수 N
        int n = Integer.parseInt(br.readLine());
        // 기존 점수를 위한 배열 생성
        int[] score = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        // 배열 안에 점수 입력
        for(int i=0;i<n;i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }
        // 최대값 구하기
        int max = 0;
        for(int i=0;i<n;i++) {
            if(max < score[i]) {
                max = score[i];
            }
        }
        // 실수 형태로 출력해야하므로 float로 배열 생성
        float[] newScore = new float[n];

        // 주작 점수 배열 안에 입력
        for(int i=0;i<n;i++) {
            newScore[i] = (float) score[i]/max*100;
        }

        // 평균을 구하기 위한 점수 총 합 구하기
        float sum = 0;
        for(int i=0;i<n;i++) {
            sum += newScore[i];
        }
        // 평균 구한 후 출력
        float average = sum/n;
        System.out.println(average);
    }
}
