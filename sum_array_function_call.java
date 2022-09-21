import java.util.Scanner;

public class sum_array_function_call {
    static int sum(int []arr)
    {
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        return sum;
    }

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the element of an array");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Sum of given array is "+ sum(arr));
    }
}
