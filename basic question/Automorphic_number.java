import java.util.Scanner;

public class Automorphic_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n= s.nextInt();
        int a=n;
        int t=n*n ;
        int j=0;
        while (n > 0) {
            n=n/10;
             j++;
        }
        int check=0;
        for(int i=1;i<=j;i++){
         check=check*10+t%10;
         t=t/10;
        }
        int ros=0;
        for (int i = 1; i <= j; i++) {
            ros=ros*10+check%10;
            check=check/10;
        }
        if (a== ros) {
            System.out.println("Number is automorphic number");
        } else {
            System.out.println("Number is not automotphic number");
        }
    }
}
