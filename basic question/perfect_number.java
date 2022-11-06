//perfect of an number
import java.util.Scanner;

public class perfect_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of value");
        int n=s.nextInt();
        int sum=0;
        for (int i = 1; i <= n/2; i++) {
            if(n%i==0){
              sum+=i;
            }
        }
        if (sum == n) {
            System.out.println("number is perfect number");
        }
        else{
            System.out.println("Number is not perfect number");
        }
    }
}
