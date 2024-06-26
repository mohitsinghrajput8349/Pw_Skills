// Q1. Write a program to sort an array in descending order using bubble sort.
// Input Array {3,5,1,6,0}
// Output Array: {6, 5, 3, 1, 0}
public class bubbleSort
{
public static void main(String[] args) {
    int[] arr = {3, 5, 1, 6, 0};
    bubbleSortDescending(arr);
    System.out.print("Sorted array in descending order: ");
    for (int num : arr) {
        System.out.print(num + " ");
    }
}

public static void bubbleSortDescending(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] < arr[j + 1]) {
                // swap arr[j] and arr[j+1]
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
}
