import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Baekjoon3003 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 킹, 퀸, 룩, 비숍, 나이트, 폰의 개수
        int[] chess = {1, 1, 2, 2, 2, 8};
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();
        // 계산
        int i = 0;
        while(st.hasMoreTokens()) {
            sb.append(chess[i] -= Integer.parseInt(st.nextToken()));
            sb.append(" ");
            i++;
        }

        System.out.println(sb.toString());
    }
}
