package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Baekjoon11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] arr = new int[n][2];
        // 좌표를 배열 안에 입력
        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0;j<2;j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // Comparator를 오버라이드 시켜서 정렬 기준을 정해준다.
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // 만약 x 좌표가 같을 경우에만 y좌표를 비교한다.
                if(o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }
                // 나머지 경우에는 x좌표끼리 비교한다.
                else {
                    return o1[0] - o2[0];
                }
            }
        });
        // 내용 출력
        for(int i=0;i<n;i++) {
            for(int j=0;j<2;j++) {
                bw.write(arr[i][j] + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
