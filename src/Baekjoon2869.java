import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken()); // 올라가는 거리
        int b = Integer.parseInt(st.nextToken()); // 미끄러지는 거리
        int v = Integer.parseInt(st.nextToken()); // 올라가는 나무 막대 길이
        // 정상까지 올라가면 미끄러지지 않으므로 미리 b를 빼주고 나눠준다
        int day = (v - b) / (a - b);

        if((v - b) % (a - b)!=0){
            day++;
        }
    }
}

// 수학은 너무 어려워... ;(