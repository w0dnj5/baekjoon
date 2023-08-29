import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Baekjoon2588 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력 받은 첫째 줄
        int a = Integer.parseInt(br.readLine());
        // 입력 받은 둘째 줄
        String b = br.readLine();
        // 일의 자리 부터 역순
        for(int i=b.length()-1;i>=0;i--) {
            // '0'의 int 값 : 49, '5'의 int 값 : 54
            // '5' - '0'
            // 54 - 49 = 5;
            int tmp = b.charAt(i) - '0';
            // 곱셈 연산 후 출력
            System.out.println(a * tmp);
        }
        // 곱셈 결과
        System.out.println(a * Integer.parseInt(b));
    }
}
