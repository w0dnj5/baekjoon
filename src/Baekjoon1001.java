import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon1001
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        // 문자열을 공백을 기준으로 쪼개서 배열 형식으로 저장
        String[] arr = str.split(" ");
        // String을 int형으로 변환 : Integer.parseInt("문자열");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        // - 연산 후 출력
        System.out.println(a - b);
    }
}
