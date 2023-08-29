import java.io.*;
import java.util.StringTokenizer;
public class Baekjoon10951 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String input;
        // BufferedReader는 EOF 처리 함수가 따로 없기 때문에 null로 처리합니다.
        while((input=br.readLine()) != null) {
            st = new StringTokenizer(input, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(a + b + "\n");
        }
        bw.flush();
        bw.close();

        /*
        Scanner sc = new Scanner(System.in);
        StringTokenizer st;
        // Scanner는 EOF 처리를 .hasNext() 메소드로 처리한다. (true, false)
        while(sc.hasNext()) {
            st = new StringTokenizer(sc.nextLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(a+b);
        }
        */
    }
}
/*
EOF란?

EOF는 End of File의 약자로, 데이터 소스로부터 더 이상 읽을 수 있는 데이터가 없음을 나타내는 용어입니다.

알고리즘 문제를 풀 때는 주로 입력값을 얼마나 받을지 명시하지 않을 경우 이 EOF를 사용합니다.

### EOF 사용법

Scanner

Scanner 클래스에서의 EOF는 단순합니다.

바로, hasNext()메소드를 사용하는 것입니다.

이것은 입력된 토큰이 있으면 true를 반환하고, 그렇지 않을 경우 false를 반환합니다.

따라서, EOF를 할 때에는 아래와 같이 코드를 작성하면 됩니다.

BufferedReader

BufferedReader는 Scanner와 달리 EOF를 처리하는 내장 함수는 없습니다.

그래서 BufferedReader는 아래와 같이 EOF를 처리합니다.

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String input;
while((input=br.readLine()) != null) {

}

br.readLine()으로 입력값을 계속 읽되, 읽은 값이 null이 되면 반복문을 종료하는 방식입니다.
 */
