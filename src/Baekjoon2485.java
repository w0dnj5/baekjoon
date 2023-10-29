import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Baekjoon2485 {

    public static int gcd(int a, int b) {
        int tmp;
        while(b > 0) {
            tmp = a;
            a = b;
            b = tmp%b;
        }
        return a;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberOfTrees = Integer.parseInt(br.readLine());
        int[] trees = new int[numberOfTrees];
        for(int i = 0; i < numberOfTrees; i++) {
            int number = Integer.parseInt(br.readLine());
            trees[i] = number;
        }

        int[] space = new int[numberOfTrees-1];
        for(int i = 0; i < numberOfTrees - 1; i++) {
            int number = trees[i+1] - trees[i];
            space[i] = number;
        }
        Arrays.sort(space);

        int firstSpace = space[0];
        int lastSpace = space[numberOfTrees-2];
        int minimumSpace = gcd(firstSpace, lastSpace);

        int firstTree = trees[0];
        int lastTree = trees[numberOfTrees - 1];
        if((lastTree - firstTree) % minimumSpace != 0) {
            minimumSpace = 1;
        }

        int result = ((lastTree - firstTree) / minimumSpace + 1) - numberOfTrees;
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
