import java.util.Scanner;

public class jagged_array {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int a[][]=new int[m][];
        int i;
        for(i=0;i<a.length;i++){
            a[i]=new int[i+1];

        for(int j=0;j<a[i].length;j++){
            a[i][j]=i;
            System.out.print(a[i][j]+" ");
        }
            System.out.println();
        }

    }
}
