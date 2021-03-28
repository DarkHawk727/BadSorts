import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2,88,100,44,75,82,66,25,19,34,72};
        // {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.print(Arrays.toString(StalinSort(arr)));
    }

    public static int[] StalinSort(int arr[]) {
        arr = Arrays.copyOf(arr, arr.length);
        int n = 0;
        for (int i = 1; i < arr.length; i++, n++) {
            if (arr[n] > arr[i]) {
                n--;
            } else {
                if (n - i > 1) {
                    arr[i + 1] = arr[n];
                }
            }
        }
        return Arrays.copyOf(arr, n + 1);
    }
}
