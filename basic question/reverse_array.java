//reverse of an array
import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=s.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the value of an array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("After reversing");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
