import java.util.Scanner;

public class Array_sorted_or_not {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the element of an array");
        for(int i=0;i<a.length;i++){
            a[i]=s.nextInt();

        }
        boolean ans=is_soted(a,n);
        if(ans==true)
            System.out.println("Yes");

        else
            System.out.println("No");
    }
    public static boolean is_soted(int[] a,int n) {
        for (int i = 1; i < n; i++) {
            if (a[i] < a[i - 1]) {
                return false;
            }
        }
        return true;
    }

}
