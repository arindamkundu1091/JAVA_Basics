import java.util.Scanner;

class NewT extends Thread {
    String name;
    int[] arr;
    int n;

    NewT(String name) {
        super(name);
    }

    NewT(int[] arr, int n) {
        this.arr = arr;
        this.n = n;
    }

    public int countFront(int[] arr, int n) {
        int result = 0;
        int count = n / 2;
        for (int i = 0; i < count; i++) {
            if (arr[i] == 100) {
                result++;
            }
        }
        // System.out.println("T1 count front");
        return result;
    }

    public int countBack(int[] arr, int n) {
        int result = 0;
        int count = n / 2;
        for (int i = n - 1; i >= count; i--) {
            if (arr[i] == 100) {
                result++;
            }
        }
        // System.out.println("T2 count back");
        return result;
    }

    public void run() {
        synchronized (this) {
            NewT t1 = new NewT("Thread1");
            NewT t2 = new NewT("Thread2");
            NewT t = new NewT(arr, n);
            int[] arr = t.arr;
            int n = t.n;
            int result = (t1.countFront(arr, n) + t2.countBack(arr, n));
            // System.out.println("Comming final Indicating");
            System.out.println("Winners : " + result);
            notify();
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.nextLine();
            String slist[] = sc.nextLine().trim().split(" ");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(slist[i]);
            }
            NewT t = new NewT(arr, n);
            t.start();
            synchronized (t) {
                // System.out.println("Main waiting");
                t.wait();
            }
            sc.close();
            // System.out.println("Main exist");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
