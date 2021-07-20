import java.util.*;
/*
Shyamal Prajapati: 190010107055
 */
public class bubbleSort {

    void bubbleFn(int[] arr, int n) {
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
    public static void main(String[] args) {
        Random numGenerator = new Random();
        int[] arr = new int[10000];

        // random array upto 1000 length
        for (int i = 1; i < 10000; i++) {
            arr[i] = numGenerator.nextInt(10000);
        }
    }   