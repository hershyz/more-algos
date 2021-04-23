### Quicksort

```java
import java.util.Arrays;

public class Main {

    /*
    * time:
    * best: O(nlogn)
    * average: O(nlogn)
    * worst: O(n^2)
    * */

    public static void main(String[] args) {

        int[] arr = {5, 2, 3, 1, 2};
        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quicksort(int[] arr, int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1) {
            quicksort(arr, left, index - 1);
        }
        if (index < right) {
            quicksort(arr, index, right);
        }
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[(left + right) / 2];
        while (left <= right) {
            while (arr[left] < pivot) {
                left++;
            }
            while (arr[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return left;
    }
}
```
