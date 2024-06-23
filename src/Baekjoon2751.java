package src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Baekjoon2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 시간 초과가 떠서 BufferedWriter를 사용해 시간을 줄여준다.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        // 정렬
        Arrays.sort(arr);
        // 출력
        for(int i=0;i<n;i++) {
            bw.write(String.valueOf(arr[i]) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
