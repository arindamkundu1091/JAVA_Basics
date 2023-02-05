class MyArray {
    int totalSize = 0;
    int usedSize = 0;
    int arr[];
    MyArray arrayobj ;

    // MyArray(MyArray obj) {
    //     obj.totalSize = totalSize;
    //     obj.usedSize = usedSize;
    //     obj.arr = new int[totalSize];
    // }
    
    void create(int tsize, int usize) {
        arrayobj.totalSize = tsize;
        arrayobj.usedSize =usize;
        arrayobj.arr = new int[tsize];
    }
    void show() {
        for (int i = 0; i < usedSize; i++) {
            System.out.print(arrayobj.arr[i]);
        }
    }
}
class Run {
    public static void main(String[] args) {
        MyArray obj = new MyArray();
        obj.create(10,2);
        obj.show();
    }
}