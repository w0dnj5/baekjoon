import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon11650 {

    public static int[] x;
    public static int[] y;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[5][];

        for(int i=0;i<n;i++) {
            arr[i] = br.readLine().split(" ");
        }

        Arrays.sort(arr);

        for(int i=0;i<n;i++) {
            for(int j=0;j<2;j++) {
                bw.write(arr[i][j]);
                bw.write(" ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    /*
        x = new int[n];
        y = new int[n];
        StringTokenizer st;
        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine()," ");
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<n-1;i++) {
            for(int j=i+1;j<n;j++) {
                if(x[i] > x[j]) {
                    change(x, i, j);
                    change(y, i, j);
                }
                else if(x[i] == x[j] && y[i] > y[j]) {
                    change(y, i ,j);
                }
            }
        }

        for(int i=0;i<n;i++) {
            bw.write(x[i] + " " + y[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static void change(int[] arr, int i, int j) {
        int tmp;
        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    */
    }


}
