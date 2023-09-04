import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        int sum;
        String t;
        String c;

        for(int i=1;i<=n;i++) {
            sum = 0;
            t = String.valueOf(i);
            for(int j=0;j<t.length();j++) {
                c = String.valueOf(t.charAt(j));
                sum += Integer.parseInt(c);
            }
            sum += Integer.parseInt(t);
            if(sum == n) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
