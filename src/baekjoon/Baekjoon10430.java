package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Baekjoon10430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // StringTokenizer를 순서대로 하나씩 불러온 후 int형으로 변환해준 후 정의 해준다.
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        // 첫째 줄 출력 (A+B)%C
        System.out.println((a+b)%c);
        // 둘째 줄 출력 ((A%C) + (B%C))%C
        System.out.println(((a%c) + (b%c))%c);
        // 셋째 줄 출력 (A×B)%C
        System.out.println((a*b)%c);
        // 넷째 줄 출력 ((A%C) × (B%C))%C
        System.out.println(((a%c)*(b%c))%c);
    }
}
