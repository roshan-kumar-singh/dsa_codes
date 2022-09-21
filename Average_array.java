import java.util.Scanner;

public class Average_array {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=s.nextInt();
        int []a=new int[n];
        System.out.println("Enter the value an array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
        float avg=0;
        for(int i=0;i<a.length;i++){
          avg=avg+a[i];
        }
         avg=avg/n;
        System.out.println("averag of an array is "+ avg);
    }
}
