import java.util.Scanner;

public class Decimal_Binary {
    public static void main(String[] args) {
   //  System.out.println(Integer.toBinaryString(11));
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n= s.nextInt();
        int [] arr=new int[n];
        int i=0;
        while (n > 0) {
            arr[i] = n % 2;
            n = n / 2;
            i++;
        }
        System.out.println("After converting binary");
        for (int j = i-1; j >= 0; j--) {
            System.err.print(arr[j]);
        }
    }
}
