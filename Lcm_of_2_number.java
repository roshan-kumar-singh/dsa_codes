import java.util.Scanner;

public class Lcm_of_2_number {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int x=Math.max(a,b);
        int ans=x;
        int y=a*b;
        for(int i=x;i<=y;i++){
            if(i%a==0 && i%b==0){
                ans=i;
                break;
            }
        }
        System.out.println(ans);
    }
}
