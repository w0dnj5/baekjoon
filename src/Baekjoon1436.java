package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x = 666;
        int r = 0;

        // 1씩 더해가면서 666이 포함되있는지 확인해준다. n번째로 작은 666이 포함된 수를 찾아주기위해 찾을때마다 n이 0이될때까지 반복해준다.
        while(n!=0) {
            if(String.valueOf(x).contains("666")) {
                n--;
                r=x;
            }
            x++;
        }
        System.out.println(r);
    }
}
