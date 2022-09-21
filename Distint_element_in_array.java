import java.util.Scanner;

public class Distint_element_in_array {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=s.nextInt();
        int [] a=new int[n];
        System.out.println("enter the element of an array");
        for(int i=0;i< a.length;i++){
            a[i]=s.nextInt();
        }
        int count=1;
        for(int i=0;i< a.length;i++){
            for(int j=i-1;j>=0;j--){
                if(a[i]==a[j]){
                    count=0;
                    break;
                }
            }
            if(count==1)
                System.out.print(a[i]+" ");
            count=1;
        }

    }
}
