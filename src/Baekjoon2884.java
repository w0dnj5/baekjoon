package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2884 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int hour = Integer.parseInt(st.nextToken());
        int minutes = Integer.parseInt(st.nextToken());

        // 일찍 알람을 설정하는 시간
        int timer = 45;

        // 시간의 분이 45분보다 작으면 60을 더한 후 타이머 시간만큼 - 해준다.
        if (minutes < timer) {
            minutes = minutes + 60 - timer;
            // 0시면 24 - 1인 23을 사용
            if (hour == 0)
                hour = 23;
                // 그 외에는 기존 시간에서 1시간을 - 해준다.
            else
                hour -= 1;
        } else {
            minutes = minutes - timer;
        }
        // StringBuffer를 통해 결과값 출력.
        StringBuffer sb = new StringBuffer();
        sb.append(hour);
        sb.append(" ");
        sb.append(minutes);

        System.out.println(sb.toString());
    }
}
