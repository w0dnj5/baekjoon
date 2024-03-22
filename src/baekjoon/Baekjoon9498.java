package baekjoon;

import java.io.*;
public class Baekjoon9498 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int score = Integer.parseInt(br.readLine());
        // 90이상 100이하 점수
        if(score >= 90 &&  score <= 100)
            bw.write("A");
            // 80이상 89이하 점수
        else if (score >= 80 && score <= 89)
            bw.write("B");
            // 70이상 79이하 점수
        else if (score >= 70 && score <= 79)
            bw.write("C");
            // 60이상 69이하 점수
        else if (score >= 60 && score <= 69)
            bw.write("D");
            // 나머지 점수
        else
            bw.write("F");
        bw.flush();
        bw.close();
    }
}
