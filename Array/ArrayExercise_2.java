class ArrayExercise_2 
{
    // Q11. Write a Java program to reverse an array of integer values.
    ///////////////////////////////////////////////////////////////////

    int [] toReverse(int arr[])
    {
        int findex = 0, lindex = arr.length-1;
        while(findex < lindex)
        {
            int temps  = 0;
            temps = arr[findex];
            arr[findex] = arr[lindex];
            arr[lindex] = temps;
            findex ++;
            lindex --;
        }
        for (int i: arr)
        {System.out.print(i+" ");}
        return arr;
    }

    //////////////////////////////////////////////////////////////////////
    // Q12. Write a Java program to find the duplicate values of an array of integer values.

    void toFindduplicateIntValues(int arr[])
    {
        for(int i = 0; i<arr.length-1 ; i++)
        {
            for(int j = i+1; j< arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.println("Index no. "+i+" and Index no. "+j+" is same.");
                }
            }
        }
    }

    /////////////////////////////////////////////////////////////////////
    // Q13. Write a Java program to find the duplicate values of an array of String values.
    void toFindduplicateStringValues(String arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Index no. " + i + " and Index no. " + j + " is same.");
                }
            }
        }
    }

    ////////////////////////////////////////////////////////////////////////
    // Q14. Write a Java program to find the common elements between two arrays (string values).

    void toFindEelementInCommonArray(String[] arr1, String[] arr2)
    {
        for(int i = 0; i<arr1.length; i++)
        {
            for(int j = 0; j<arr2.length; j++)
            {
                if(arr1[i] == arr2[j])
                {
                    System.out.println("index no. "+i+" of 1st array and index no. "+j+" of 2nd array is same.");
                }
            }
        }
    }
}
