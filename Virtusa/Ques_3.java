import java.util.*;

interface Matrix{
    void diagonalsMinMax(int a[][]);
}

class Try implements Matrix{
    public void diagonalsMinMax(int a[][]){
        int j = a[0].length;
        int d1[] = new int[j];
        int d2[] = new int[j];
        for(int i = 0 ; i < a[0].length; i++){
            d1[i] = a[i][i];
            d2[i] = a[i][j-1];
			j--;
        }
        Arrays.sort(d1);
		Arrays.sort(d2);

        System.out.println("Smallest Element - 1: "+d1[0]);
        System.out.println("Greatest Element - 1: "+d1[a[0].length-1]);
        System.out.println("Smallest Element - 2: "+d2[0]);
        System.out.println("Greatest Element - 2: "+d2[a[0].length-1]);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        sc.nextLine();
        for(int i = 0; i<n ; i++){
            String str[] = sc.nextLine().trim().split(" ");
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(str[j]);
			}
        }
        Try obj = new Try();
        obj.diagonalsMinMax(arr);
        sc.close();
    }
}
