import java.io.*;
import java.util.StringTokenizer;
public class Baekjoon2525 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int timer = Integer.parseInt(br.readLine());
        if(min + timer >= 60) {
            // 분과 타이머를 합친 값에서 60으로 나눠서 그 시간만큼 더 해준다.
            hour += (min + timer)/60;
            // 24시 이상이면 -24를 해준다.
            if(hour >= 24)
                hour -= 24;
            // 분을 60으로 나눠준다.
            min = (min + timer)%60;
        }
        else min += timer;

        StringBuffer sb = new StringBuffer();
        sb.append(hour);
        sb.append(" ");
        sb.append(min);

        System.out.println(sb.toString());
    }
}
