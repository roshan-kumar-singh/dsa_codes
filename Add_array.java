import java.util.Scanner;

public class Add_array {
    public static void main(String[]args){

        System.out.println("Enter the size of an array");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the value");
        for(int i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println("sum of an array " +sum);

    }
}

