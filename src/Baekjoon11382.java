import java.io.*;
public class Baekjoon11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // " "(공백)을 기준으로 split() 메소드를 통해 입력받은 문자열을 분리해 배열로 넣어주기
        String[] input = br.readLine().split(" ");
			  /*
					A, B, C 모두 최대 10^12까지 들어갈 수 있으므로
					int 범위(-2,147,483,648 ~ 2,147,483,647)를 초과하므로 단위를 long으로 잡아준다.
				*/
        long result = 0;
        for(int i=0;i<input.length;i++) {
            // input[i]는 String이므로 Long으로 형변환 시켜줘야한다.
            long tmp = Long.parseLong(input[i]);
            result += tmp;
        }
        System.out.println(result);

        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				// StringTokenizer를 통해 " "(공백)을 기준으로 토큰화 시키기.
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
         */
				/*
					A, B, C 모두 최대 10^12까지 들어갈 수 있으므로
					int 범위(-2,147,483,648 ~ 2,147,483,647)를 초과하므로 단위를 long으로 잡아준다.
				*/
        /*
        long result = 0;
        // 토큰이 존재하는 동안 while 반복문 실행
        while(st.hasMoreTokens()) {
            // result 값에 계속 더 해주기
            result += Long.parseLong(st.nextToken());
        }
        System.out.println(result);
        */
    }
}
