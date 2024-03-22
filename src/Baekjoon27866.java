import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Baekjoon27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());
        // s.charAt(index)로 index번째 문자 출력
        System.out.println(s.charAt(n-1));
    }
}
