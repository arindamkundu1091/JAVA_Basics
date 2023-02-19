class NewThread {
    int counter = 1;
    static int n;

    public void printOddNumber() {
        synchronized (this) {
            while (counter < n) {
                if (counter % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Thread Odd: " + counter);
                counter++;
                notify();
            }
        }
    }

    public void printEvenNumber() {
        synchronized (this) {
            while (counter < n) {
                if (counter % 2 != 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Thread Even: " + counter);
                counter++;
                notify();
            }
        }
    }

    public static void main(String[] args) {
        n = 20;
        NewThread nt = new NewThread();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                nt.printOddNumber();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                nt.printEvenNumber();
            }
        });
        t1.start();
        t2.start();
    }
}
