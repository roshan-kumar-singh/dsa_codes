import java.util.*;
class leap_year{
    static boolean yyear(int year)
    {
        if(year % 400 == 0)
            return true;
        if(year % 100 == 0)
            return false;
        if(year % 4 == 0)
            return true;
        return false;
    }
    public static void main(String args[])
    {
        int year=2001;
        if(yyear(year)==true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
