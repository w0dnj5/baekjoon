import java.io.*;
import java.util.StringTokenizer;
public class Baekjoon1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        // A 정의
        int a = Integer.parseInt(st.nextToken());
        // B 정의
        int b = Integer.parseInt(st.nextToken());
        // A가 B보다 큰 경우에는 '>'를 출력한다.
        if(a > b) {
            System.out.println(">");
        }
        // A가 B보다 작은 경우에는 '<'를 출력한다.
        else if(a < b) {
            System.out.println("<");
        }
        // A와 B가 같은 경우에는 '=='를 출력한다.
        else {
            System.out.println("==");
        }
    }
}
