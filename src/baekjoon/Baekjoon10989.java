package baekjoon;

import java.io.*;

public class Baekjoon10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        // 카운팅 정렬을 사용햿다.
        // 문제에서 수의 범위가 10000이하의 자연수이므로 10000 길이의 배열을 만들어준다.
        int[] number = new int[10000];
        // 배열의 인덱스는 0부터이지만 자연수는 1부터이므로 입력받은 숫자-1에 해당하는 인덱스에 숫자를 +1 해준다.
        for(int i=0;i<n;i++) {
            number[Integer.parseInt(br.readLine())-1]++;
        }
        // 1~10000까지의 수를 확인하는데 배열 안에 숫자가 0이면 넘어가고 아니면 배열 안에 숫자만큼 반복해서 인덱스를 출력해준다.
        for(int i=0;i<10000;i++) {
            if(number[i]!=0) {
                for(int j=0;j<number[i];j++) {
                    bw.write(String.valueOf(i+1) + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
