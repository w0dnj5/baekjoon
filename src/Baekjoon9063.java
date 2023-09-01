import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] x = new int[n];
        int[] y = new int[n];
        StringTokenizer st;

        // x값과 y값 각각 배열로 나눠준다.
        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine(), " ");
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        // 각 배열들을 정렬해준다.
        Arrays.sort(x);
        Arrays.sort(y);

        // 각 변의 길이는 max - min, 배열의 마지막 값이 최대, 첫 번째가 최소이므로 둘을 뺴주면 된다.
        int width = x[n-1] - x[0];
        int height = y[n-1] - y[0];

        System.out.println(width * height);
    }
}
