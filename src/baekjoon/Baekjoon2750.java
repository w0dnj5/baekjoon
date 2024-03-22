package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        /* 사실 알고리즘 구현없이 메소드 하나로 쉽게 풀 수 있다.
        Arrays.sort(arr);
        */
        sort(arr);

        for(int i=0;i<n;i++) {
            System.out.println(arr[i]);
        }
    }
    // 선택정렬 알고리즘을 구현해봤다.
    public static void sort(int[] arr) {

        int tmp;
        for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]>arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
