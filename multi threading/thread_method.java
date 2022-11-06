import org.w3c.dom.ls.LSOutput;

public class thread_method {
    public static void main(String[] args) {
        Mythread t = new Mythread("Roshan kumar singh");
        System.out.println("ID "+ t.getId());
        System.out.println("Name "+t.getName());
        System.out.println("Priority "+ t.getPriority());
        System.out.println("state "+t.getState());
        System.out.println("Alive  "+t.isAlive());
    }
}

class Mythread extends Thread {
    public Mythread(String name)//constructor which is passing parameter name
    {
        super(name); //super

    }
}
