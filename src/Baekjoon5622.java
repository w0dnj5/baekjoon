import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Baekjoon5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int t = 0;

        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            switch(c) {
                case 'A':
                case 'B':
                case 'C':
                    t+=3;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    t+=4;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    t+=5;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    t+=6;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    t+=7;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    t+=8;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    t+=9;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    t+=10;
                    break;
            }
        }
        System.out.println(t);
    }
}

//이 방법 말고도 아스키코드 값으로 범위를 설정해 풀 수 있을거 같다... (풀고 나서 깨달았다... )
