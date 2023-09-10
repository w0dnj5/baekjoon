import java.io.*;
import java.util.*;

public class Baekjoon7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        // 사전 역순으로 이름을 출력해야하므로 순서를 저장하는 TreeSet으로 저장한다.
        // 하지만 그냥 저장하면 순서대로 저장되기 때문에 Comparator를 통해서 역순으로 저장해준다.
        Set<String> set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        Iterator<String> it;
        String name;
        String status;

        for(int i=0;i<n;i++) {
            it = set.iterator();
            st = new StringTokenizer(br.readLine());
            name = st.nextToken();
            status = st.nextToken();
            // Set 목록에 아무도 없으면 그냥 추가해준다.
            if(!it.hasNext()) {
                set.add(name);
            }
            else {
                // 만약 상태가 enter이면 set에 추가한다.
                if(status.equals("enter")) {
                    set.add(name);
                }
                // 그 외의 경우는 leave 밖에 없으므로 이름을 제거해준다.
                else {
                    set.remove(name);
                }
            }
        }
        // 출력
        it = set.iterator();
        while(it.hasNext()) {
            bw.write(it.next() + "\n");
        }
        bw.flush();
        bw.close();
    }
}
