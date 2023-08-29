import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Baekjoon3052 {
    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int[] arr = new int[10];

            for(int i=0;i<10;i++) {
                int n = Integer.parseInt(br.readLine());
                arr[i] = n%42;
            }
            int[] result = Arrays.stream(arr).distinct().toArray();
            System.out.println(result.length);
        }
    }
}

// 물론 Set의 중복을 제거하는 성질을 이용해 풀 수도 있지만 1차원 배열 문제인 만큼 1차원 배열로 풀어보았다.
