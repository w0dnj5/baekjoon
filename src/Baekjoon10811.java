import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Baekjoon10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 바구니 개수
        int n = Integer.parseInt(st.nextToken());
        // 횟수
        int m = Integer.parseInt(st.nextToken());
        // 바구니 생성
        int[] arr = new int[n];
        // 바구니에 숫자 넣어주기
        for(int k=0;k<n;k++) {
            arr[k] = k+1;
        }
        // m번 반복
        for(int k=0;k<m;k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            // j-i +1 길이의 임시 배열 생성 (i ~ j에서 j를 포함하므로 +1 해준다.)
            int[] tmp = new int[j-i+1];
            // 기존 배열에서 i ~ j만큼을 역순으로 임시 배열에 저장
            for(int l=0;l<j-i+1;l++) {
                tmp[l] = arr[j-1-l];
            }
            // 임시 배열을 i ~ j만큼 다시 대입
            for(int l=i-1;l<j;l++) {
                arr[l] = tmp[l-i+1];
            }
        }
        // StringBuffer에 출력할 내용 저장
        StringBuffer sb = new StringBuffer();
        for(int l=0;l<n;l++) {
            sb.append(arr[l]);
            sb.append(" ");
        }
        // 출력
        System.out.println(sb.toString());
    }
}
