package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int sum = 0;
        for(int i=0;i<5;i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        /* 메소드 하나로 쉽게 정렬할 수 있다.
        Arrays.sort(arr);
        */
        sort(arr);

        for(int i=0;i<5;i++) {
            sum+= arr[i];
        }
        System.out.println(sum/5);
        System.out.println(arr[(5-1)/2]);
    }
    // 이번엔 삽입 정렬 알고리즘으로 풀어봤다.
    public static void sort(int[] arr) {
        for(int i=1;i<5;i++) {
            int target = arr[i];
            int c = i-1;
            while(c >= 0 && target < arr[c]) {
                arr[c+1] = arr[c];
                c--;
            }
            arr[c+1] = target;
        }

    }
}
