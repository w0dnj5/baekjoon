public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 3, 7, 4};

        for (int i = 0; i < arr.length; i++) {
            int idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    idx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }

        for (int i : arr) {
            System.out.print(i);
        }
    }
}
