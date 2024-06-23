package src;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Baekjoon1008 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        System.out.println((double)a/b);
    }
}
