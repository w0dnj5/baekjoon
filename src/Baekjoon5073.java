package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] triangle;
        boolean flag = true;

        while(flag) {
            triangle = new int[3];
            st = new StringTokenizer(br.readLine(), " ");
            triangle[0] = Integer.parseInt(st.nextToken());
            triangle[1] = Integer.parseInt(st.nextToken());
            triangle[2] = Integer.parseInt(st.nextToken());
            // 배열 정렬
            Arrays.sort(triangle);

            // 세 변이 모두 0이면 합도 0
            if(triangle[0]+triangle[1]+triangle[2] == 0) {
                flag = false;
            } // 젤 큰 변의 길이가 나머지 둘의 합보다 작아야 삼각형 성립
            else if(triangle[0] + triangle[1] <= triangle[2]){
                System.out.println("Invalid");
            }
            else {
                // 세 변이 모두 같은 경우
                if(triangle[0] == triangle[1]) {
                    if(triangle[1] == triangle[2]) {
                        System.out.println("Equilateral");
                    }
                    else { // 두 변의 길이만 같은 경우
                        System.out.println("Isosceles");
                    }
                }
                else { // 두 변의 길이만 같은 경우
                    if(triangle[1] == triangle[2]) {
                        System.out.println("Isosceles");
                    }
                    else { // 모두 다른 경우
                        System.out.println("Scalene");
                    }
                }
            }
        }
    }
}
