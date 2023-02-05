public class ArrayExercise_1 
{
    ////////////////////-:(01 - 10):-///////////////////////////////

    // Q1. Write a java program to sort a numeric array and a string array.
    // >>Part:1
    int[] toSortNumericArray(int[] arr)
    {
        for(int i = 0; i<arr.length; i++)
        {
            for(int j = 0; j<arr.length; j++)
            {
                if(arr[j] >= arr[i])
                {
                    int temps = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temps;
                }
            }
        } 
        for(int i: arr)
        {
            System.out.print(i+" ");
        }
        return arr;
    }
    // >>Part:2
    String[] toSortStringArray(String arr[])
    {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int c1 = 0;
                int c2 = 0;
                for(int k1 = 0; k1<arr[i].length(); k1++ )
                {c1 = arr[i].charAt(k1);}
                for(int k2 = 0; k2<arr[j].length(); k2++ )
                {c2 = arr[j].charAt(k2);}
                if (c2 >= c1) {
                    String temps = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temps;
                }
            }
        }
        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    //////////////////////////////////////////////////////////////////////
    // Q2. Write a java program to sum values of an array.

    int toSumValue(int arr[])
    {
        int sum = 0;
        for(int i = 0; i<arr.length; i++)
        {
            sum = sum + arr[i];
        }
        System.out.println("The sum of the values in array is: "+sum);
        return sum;
    }

    ////////////////////////////////////////////////////////////////////////
    // Q3. Write a java program to print the following grid.

    void toPrintChar()
    {
        char arr[][] = new char[15][10];
        for(int i = 0; i <15; i++)
        {
            for(int j = 0 ; j<10; j++ )
            {
                arr[i][j]= '-';
            }
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }

    /////////////////////////////////////////////////////////////////////////
    // Q4. Write a java program to calculate the average value of array elements.

    double toCalculateAverage(int[] arr)
    {
        int i = 0; double avg = 0;
        for(i = 0; i<arr.length; i++)
        {
            avg = avg + arr[i];
        }
        avg = avg/i;
        System.out.println("Average of the array elements is: "+avg);
        return avg;
    }

    //////////////////////////////////////////////////////////////////////
    // Q5. Write a java program to test if an array contains a specific value.

    boolean toCheckValue(int[] arr, int value)
    {
        boolean check = false;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] == value)
            {
                System.out.println("The value is in Index no.: "+i);
                check = true;
                break;
            }
        }
        if(check == false)
        System.out.println("The value is not present.");
        return check;
    }

    //////////////////////////////////////////////////////////////////////
    // Q6. Write a java program to find the index of an array element.

    int toFindIndex(int arr[], int element)
    {
        int firstindex = 0, lastindex = arr.length-1, middleindex = (firstindex + lastindex)/2, index = 0;
        while(firstindex <= lastindex)
        {
            if(arr[middleindex] == element)
            {
                index = middleindex;
                System.out.println(element+" is in "+index+" index.");
                break;
            }
            else if(arr[middleindex] >= element)
            {
                lastindex = middleindex-1;
            }
            else if(arr[middleindex] <= element)
            {
                firstindex = middleindex+1;
            }
        }
        return index;
    }

    /////////////////////////////////////////////////////////////////////
    // Q7. Write a java program to remove specific element in an array.

    void toRemove(int arr[], int element)
    {
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] == element)
            {
                arr[i] = 0;
                System.out.println(element + " is removed by '0' is in " + i + " index.");
            }
        }
    }

    ///////////////////////////////////////////////////////////////////
    // Q.8 Write a java program to copy an array by iterating the array.

    int[] toCopy(int arr[])
    {
        int copyarr[] = new int[arr.length];
        for(int i = 0; i<arr.length; i++)
        {
            copyarr[i] = arr[i];
        }
        for(int i: copyarr)
        {
            System.out.print(i+" ");
        }
        return copyarr;
    }

    ////////////////////////////////////////////////////////////////////
    // Q9. Write a java program to insert an element (specific position) into an array.

    void toInsert(int arr[], int index, int element)
    {
        for(int i = 0; i<arr.length; i++)
        {
            if(i == index)
            {
                arr[i] = element;
                System.out.println("Element insertion is successful.");
                break;
            }
        }
    }

    ///////////////////////////////////////////////////////////////////
    // Q10. Write a java program to find the maximun and minimum value of an array.

    void toFindMaxMin(int arr[])
    {
        int j = 1, temps = 0, temps1 = 0;
        for(int i = 0; i<arr.length; i++)
        {
            temps = arr[j];
            if (temps < arr[i]) 
            {
                j = i;
            }
            temps = arr[j];
        }
        j = 0;
        for(int i = 0; i<arr.length; i++)
        {
            temps1 = arr[j];
            if (temps1 > arr[i]) 
            {
                j = i;
            }
            temps1 = arr[j];
        }
        System.out.println("The Maximun number is: "+temps);
        System.out.println("The Minimun number is: "+temps1);
    }

    ///////////////////////////////////////////////////////////////////

}
