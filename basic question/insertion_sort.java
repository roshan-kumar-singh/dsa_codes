import java.util.Scanner;

public class insertion_sort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value for array");
        int n=s.nextInt();
        int []arr ={10,20,50,10,30,50,80};
        insertsort(arr, n);
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+"  ");
        }
    }

    static void insertsort(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}
