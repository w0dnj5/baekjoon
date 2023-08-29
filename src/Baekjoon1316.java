import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Baekjoon1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int r = n;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            int l = s.length();
            if (l > 2) {
                for (int j = 0; j < l - 1; j++) {
                    char c1 = s.charAt(j);
                    char c2 = s.charAt(j + 1);
                    /*
						c1 과 c2가 다를 때 c2 다음 문자부터 c1 유무를 indexOf(문자, 인덱스)
						함수로 확인 없으면 -1 있으면 인덱스를 반환
					*/
                    if (c1 != c2 && s.indexOf(c1, j + 2) != -1) {
                        r--;
                        break;
                    }
                }
            }
        }
        System.out.println(r);
    }
}
