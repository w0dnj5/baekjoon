import java.io.*;
import java.util.Map;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Baekjoon1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        // 번호를 검색하기 위한 맵과 이름을 검색하기 위한 맵 두 개를 만들어준다.
        Map<String, Integer> searchNumber = new HashMap<>();
        Map<Integer, String> searchName = new HashMap<>();
        // 번호를 검색하기 위한 맵에는 이름을 key로, 이름을 검색하기 위한 맵에는 번호를 key로 값을 넣어준다.
        String name;
        for(int i=0;i<n;i++) {
            name = br.readLine();
            searchNumber.put(name, i+1);
            searchName.put(i+1, name);
        }

        String question;
        for(int i=0;i<m;i++) {
            question = br.readLine();
            // 아래의 isInt(String str) 함수를 통해서 정수인지 아닌지 확인 후 정수가 아니면 key가 String인 맵으로 정수이면 key가 int인 맵으로 검색을 한다.
            if(!isInt(question)) {
                bw.write(searchNumber.get(question) + "\n");
            }
            else {
                bw.write(searchName.get(Integer.parseInt(question)) + "\n");
            }
        }
        // 출력
        bw.flush();
        bw.close();

    }
    // String -> int 형변환을 통해서 형변환이 되지않는다면 false, 된다면 true를 반환한다.
    public static boolean isInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }
}
