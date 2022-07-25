import java.util.Scanner;

public class Gcd_of_2_number {
    public static void main( String[]args){
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int div=1,i;
        int x=Math.min(a,b);
        for(i=1;i<=x;i++){
            if(a%i==0 && b%i==0){
                div=i;
            }
        }
        System.out.println("gcd of two number "+div);
    }
}
