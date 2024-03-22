package baekjoon;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Baekjoon25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String[] grade = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
        double[] credit = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0};
        // 학점 * 과목평점 총 합
        double sum = 0;
        // 학점 총합
        double totalCredit = 0;
        // 20줄의 경우의 수가 나오므로 20번 반복문을 돌려준다.
        for(int i=0;i<20;i++) {
            String s = br.readLine();
						/*
							과목명은 우리한테 필요 없는 부분이므로 " "가 첫 번째로 나오는 인덱스에서 +1부터
							끝까지 substring() 메소드로 짤라준다.
						*/
            s = s.substring(s.indexOf(" ") + 1);
            st = new StringTokenizer(s, " ");

            double c = Double.parseDouble(st.nextToken());
            String g = st.nextToken();
            // 등급이 P인 경우 계산하지 않으므로 예외처리를 해준다.
            if(!g.equals("P")) {
                // (학점 * 과목평점) / 학점총합이므로 따로 더 해준다.
                for(int j=0;j<grade.length;j++) {
                    if(g .equals(grade[j])) {
                        sum += credit[j] * c;
                        totalCredit += c;
                    }
                }
            }
        }
        // 학점 계산
        System.out.println(sum/totalCredit);
    }
}
