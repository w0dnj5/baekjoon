import java.io.*;
public class Baekjoon2753 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 년도 입력 받기
        int year = Integer.parseInt(br.readLine());
        // 4의 배수이면서 100의 배수가 아닐 때 '또는' 400의 배수일 때 조건문
        if(year%4==0 && year%100!=0 || year%400==0)
            // 윤년이면 1 출력
            bw.write("1");
        else
            // 아니면 0 출력
            bw.write("0");
        bw.flush();
        bw.close();

    }
}
