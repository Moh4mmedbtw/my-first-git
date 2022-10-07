import java.util.Arrays;

public class Sorter {

    public static void main(String[] args) {
        int[] x = {5,4,3,1,2,7};
        int[] y = {5,4,3,1,2,7};
        selectSort(x);
        insertSort(y);
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));
    }

    public static void selectionSort(int[] arr)
    {
        int n = arr.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int[] arr){
        int size = arr.length;

        for (int step = 1; step < size; step++){
            int key = arr[step];
            int j = step - 1;

            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                --j;
            }

            arr[j + 1] = key;
        }
    }

    public static void insertSort(int[] arr){
        insertionSort(arr);
    }

    public static void selectSort(int[] arr){
        selectionSort(arr);
    }
    
}
