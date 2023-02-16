public class AlteredArray {
    void alteredArray(int arr[], int k) {
        int newarr[] = new int[arr.length];
        int len = arr.length;
        // int count = 0;

        for(int j = 1; j<=k; j++) {
            newarr[0] = arr[len-1];
            for(int i = 0; i<len-1; i++) {
                newarr[i+1] = arr[i];
            }
            for(int i=0; i<len; i++) {
                arr[i] = newarr[i];
            }
            // count++;
        }
        // System.out.println(count);
        for (int i : newarr) {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 2;

        AlteredArray aarr = new AlteredArray();
        aarr.alteredArray(arr, k);
    }
}
