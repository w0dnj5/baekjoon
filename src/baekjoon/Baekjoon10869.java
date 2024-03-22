package baekjoon;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Baekjoon10869 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        // 첫째 줄 A+B
        System.out.println(a+b);
        // 둘째 줄 A-B
        System.out.println(a-b);
        // 셋째 줄 A*B
        System.out.println(a*b);
        // 넷째 줄 A/B
        System.out.println(a/b);
        // 다섯째 줄 A%B
        System.out.println(a%b);
    }
}
