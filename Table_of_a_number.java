import java.util.Scanner;

public class Table_of_a_number {
    public static void main(String[] ajay){
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1;i<=10;i++){
            System.out.print(n*i+ " ");
        }
    }
}
