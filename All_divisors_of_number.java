import java.util.Scanner;

public class All_divisors_of_number {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+ " ");
            }
        }
    }
}
