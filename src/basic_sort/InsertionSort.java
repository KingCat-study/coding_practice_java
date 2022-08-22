package basic_sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {328,33,1,393,22,89,9};

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[i]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for(int l : arr) {
            System.out.println(l);
        }
    }
}
