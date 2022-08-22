package basic_sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {328,33,1,393,22,89,9};

        int indexMin = 0;
        for (int i = 0; i < arr.length -1; i++) {
            indexMin = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[indexMin]) {
                    indexMin = j;
                }
            }

            int tmp = arr[indexMin];
            arr[indexMin] = arr[i];
            arr[i] = tmp;
        }

        for(int l : arr) {
            System.out.println(l);
        }
    }
}
