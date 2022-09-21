public class String_buffer {
    public static void main(String[]args){
        StringBuilder s1=new StringBuilder("geeks");

        StringBuilder s2=s1;
        s1=s1.append("forgeeks");

        if(s1==s2)
            System.out.println("same");
        else
            System.out.println("Not same");
    }
}
