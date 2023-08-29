import java.io.*;
import java.util.StringTokenizer;
public class Baekjoon2480 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int result = 0;
        // 주사위 1
        int d1 = Integer.parseInt(st.nextToken());
        // 주사위 2
        int d2 = Integer.parseInt(st.nextToken());
        // 주사위 3
        int d3 = Integer.parseInt(st.nextToken());

        // 주사위가 모두 값이 같을 때
        if(d1 == d2 && d1 == d3 && d2 == d3) {
            result = 10000+(d1*1000);
        }
        // 주사위가 모두 값이 다를 때
        else if(d1 != d2 && d1 != d3 && d2 != d3) {
            // d1이 d2, d3보다 클 때
            if(d1 > d2 && d1 > d3) {
                result = d1*100;
            }
            // d2이 d1, d3보다 클 때
            else if(d2 > d1 && d2 > d3) {
                result = d2*100;
            }
            // d3이 d1, d2보다 클 때
            else {
                result = d3*100;
            }
        }
        // 주사위가 두 개만 같을 때
        else {
            // d1이 d2 또는 d3랑 같을 때
            if(d1 == d2 || d1 == d3) {
                result = 1000+(d1*100);
            }
            // d2가 d1 또는 d3랑 같을 때
            else if(d2 == d1 || d2 == d3) {
                result = 1000+(d2*100);
            }
            // d3이 d1 또는 d2랑 같을 때
            else if(d3 == d1 || d3 == d2) {
                result = 1000+(d3*100);
            }
        }
        // 결과값 출력
        System.out.println(result);
    }
}
