class NewThread implements Runnable {
    
    Thread t;
    NewThread() {
        t = new Thread(this, "newThread");
        System.out.println("Child Thread: "+t);
    }
    
    public void run() {
        try {
            for(int i = 0; i < 5; i++) {
                Thread.sleep(500);
                System.out.println("Child Timer: "+i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
    
        NewThread nt = new NewThread();
        nt.t.start();

        try{
            for(int i = 0; i<5; i++){
                Thread.sleep(1000);
                System.out.println("Main Timer: "+i);
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}