public class multithreading_intro extends Thread {
    public static void main(String[]args) {

        multithreading_intro s=new multithreading_intro();
        s.start();
        int i=1;
        while (true) {
            System.out.println(i +" Hello");
            i++;
        }

    }

    public void run() {
        int i=1;
        while (true) {
            System.out.println(i +"World");
            i++;
        }
    }
}
