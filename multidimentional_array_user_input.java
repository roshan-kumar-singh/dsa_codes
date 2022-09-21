import java.util.Scanner;

public class multidimentional_array_user_input {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the dimension of an array");
        int m=s.nextInt();
        int n=s.nextInt();
       int a[][]=new int[m][n];
        System.out.println("Enter the value an array");
       for(int i=0;i<a.length;i++){
           for(int j=0;j<a[i].length;j++){
             a[i][j]=s.nextInt();
           }
       }
       for(int i=0;i<a.length;i++){
           for(int j=0;j<a[i].length;j++){
               System.out.print(a[i][j]+" ");
           }
           System.out.println();
       }
            }
        }

