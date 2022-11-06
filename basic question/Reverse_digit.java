//Reverse digit of a number
import java.util.Scanner;

public class Reverse_digit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of value");
        int n=s.nextInt();
        int r=0;
        while (n > 0) {
            r = r * 10 + n % 10;
            n = n / 10;
        }
        System.out.println("after reversing"+ r);

    }

}
