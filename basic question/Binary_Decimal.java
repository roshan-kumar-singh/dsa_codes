import java.util.Scanner;

public class Binary_Decimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n= s.nextInt();
        int i=0;
        double sum = 0;
        while (n != 0) {
            int t = n % 10;
            sum += t * Math.pow(2, i);
            t=t/10;
            i++;

        }
        System.out.println(sum);
    }
}
