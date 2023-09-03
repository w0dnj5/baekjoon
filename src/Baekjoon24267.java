import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon24267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        /*
            확률과 통계 nCr 공식을 사용해야한다...
            nCr = n!/(n-r)!*r! (!는 팩토리얼, ex) 3! = 3 * 2 * 1)
        */
        System.out.println((long)n*(n-1)*(n-2)/6);
        // 최고차항만 남기게되면 시간 복잡도는 O(n^3)가 된다.
        System.out.println(3);
    }
}
