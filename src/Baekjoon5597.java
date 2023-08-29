import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Baekjoon5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 전체 학생 수
        int student = 30;
        // 학생 수 크기의 boolean 배열 생성
        boolean[] check = new boolean[student];
				/*
					학생 수 - 미제출 학생 만큼 반복문을 실행
					boolean 배열의 기본 값은 false이므로 값을 받으면 true로 바꿔준다.
				*/
        for(int i=0;i<student-2;i++) {
            int index = Integer.parseInt(br.readLine())-1;
            check[index] = true;
        }
        // false이면 미제출이므로 false인 index를 출력.
        for(int i=0;i<student;i++) {
            if(!check[i]) {
                System.out.println(i+1);
            }
        }
    }
}
