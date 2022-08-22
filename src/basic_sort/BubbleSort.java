package basic_sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {328,33,1,393,22,89,9};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i ; j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        for(int l : arr) {
            System.out.println(l);
        }
    }
}
