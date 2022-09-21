import java.util.Scanner;

public class divisor_question {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count1=0;
        int count2=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%j==0)
                  count1++;
            }
            if(count1==3)
                System.out.print(i+" ");
               count1=0;
        }
    }
}
