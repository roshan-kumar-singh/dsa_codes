class runnable_multi implements Runnable {
    public void run() {
        int i=0;
        while (true) {
            System.out.println(i +" Hello");
            i++;
        }
    }
    public static void main(String[] args) {
     runnable_multi t =new runnable_multi();
     Thread r =new Thread(t);
     r.start();
     int i=0;
        while (true) {
            System.out.println(i + " World");
            i++;
        }
    }



}
