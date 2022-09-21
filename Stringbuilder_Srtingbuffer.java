public class Stringbuilder_Srtingbuffer {
    public static void main(String[]args){
        String s1="geeks";
        String s2=s1;
        s1=s1+"forgeeks";
        if(s1==s2)
            System.out.println("same");
        else
            System.out.println("Not same");


    }
}
