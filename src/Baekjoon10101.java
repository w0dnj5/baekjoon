import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int z = Integer.parseInt(br.readLine());

        if(x+y+z == 180) {
            // 세 각의 크기가 모두 60이면, Equilateral 위에 삼각형의 조건인 세 각의 합이 180이므로 x와 y가 60이면 자동으로 z는 60이 된다.
            if(x==60 && y==60) {
                System.out.println("Equilateral");
            } // 세 각의 합이 180이고, 두 각이 같은 경우에는 Isosceles
            else if(x==y || x==z || y==z) {
                System.out.println("Isosceles");
            } // 세 각의 합이 180이고, 같은 각이 없는 경우에는 Scalene
            else {
                System.out.println("Scalene");
            }
        } // 세 각의 합이 180이 아닌 경우에는 Error
        else {
            System.out.println("Error");
        }
    }
}