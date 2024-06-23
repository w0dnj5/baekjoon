package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // 이것 역시 collection 프레임워크를 사용하면 메소드로 정렬이 가능하다.
        sort(arr);

        System.out.println(arr[k-1]);
    }
    // 버블 정렬로 구현해봤다. 큰 순서대로 앞으로 정렬
    public static void sort(int[] arr) {
        int tmp;
        for(int i=arr.length-1;i>0;i--) {
            for(int j=0;j<i;j++) {
                if(arr[j] < arr[j+1]) {
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}
