import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Baekjoon2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] arr = new String[9][9];
        int max = 0;
        int x = 0;
        int y = 0;
        // 1차원 배열 안에 배열을 넣어서 2차원 배열을 완성한다.
        for(int i=0;i<9;i++) {
            arr[i] = br.readLine().split(" ");
        }
        // 반복문을 실행해서 max 값과 좌표를 찾아준다.
        for(int i=0;i<9;i++) {
            for(int j=0;j<9;j++) {
                int n = Integer.parseInt(arr[i][j]);
                if(max <= n) {
                    max = n;
                    x = i+1;
                    y = j+1;
                }
            }
        }
        // 출력
        System.out.println(max);
        System.out.println(x + " " + y);
    }
}
