import java.util.Scanner;

public class Max_of_an_array {
    public static int max(int[]a){
        int m=a[0];

        for(int i=0;i<a.length;i++){
            if(a[i]>m){
                m=a[i];
            }


        }
        return m;
    }

    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size an array");
        int n=s.nextInt();
        int [] a=new int[n];
        System.out.println("Enter the element an array");
        for(int i=0;i<n;i++) {
            a[i]=s.nextInt();
        }
        System.out.println("max element an array "+max(a));
    }
}
