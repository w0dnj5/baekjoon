import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        // 2차원 배열을 생성해서 좌표를 넣어준다.
        int[][] arr = new int[3][2];
        for(int i=0;i<3;i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0;j<2;j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int x;
        int y;
        // 평행한 직사각형이 되려면 x, y값이 서로 같은 좌표가 두개씩 나와야한다. 따라서 두개가 같은 경우를 찾아서 구해주면 된다.
        if(arr[0][0] == arr[1][0]) {
            x = arr[2][0]; // ex) x1 == x2면 x3과 같은 값이 하나 더 필요
        }
        else if(arr[0][0] == arr[2][0]) {
            x = arr[1][0];
        }
        else {
            x = arr[0][0];
        }

        if(arr[0][1] == arr[1][1]) {
            y = arr[2][1];
        }
        else if(arr[0][1] == arr[2][1]) {
            y = arr[1][1];
        }
        else {
            y = arr[0][1];
        }

        System.out.println(x + " " + y);
    }
}
