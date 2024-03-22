import java.io.*;
import java.util.StringTokenizer;
public class Baekjoon10952 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = -1;
        int b = -1;
        // 반복문 T번 반복
        while(true) {
            // A, B 값
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            int result = a + b;
            if(result==0) {
                break;
            }
            else {
                bw.write(result + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
