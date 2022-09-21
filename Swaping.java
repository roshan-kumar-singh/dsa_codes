import java.util.Scanner;

public class Swaping {
    public static void main(String[] ankit){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value of x and y");
        int x=s.nextInt();
        int y=s.nextInt();

        System.out.println("After swaping "+swap(x,y));
    }
    public static int  swap( int x,int y){
        if(x==0||y==0){
            return 0;
        }
        x=x+y;
        y=x-y;
        x=x-y;
        return swap(x-1,y-1);
    }
}
