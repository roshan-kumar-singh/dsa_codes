public class reverse {
    public static int s = 0;
    public static int Rev(int n){
        if (n==0)
            return s;
        s = s*10+n%10;
        return Rev(n/10);

    }
    public static void main(String[] args) {
        System.out.println(Rev(123));
    }
}
