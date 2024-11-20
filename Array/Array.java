class Array
{
    int[] toCreate(String values)
    {
        int index = 0;
        String input = values;
        String[] withoutcommastr = input.split(",");
        index = withoutcommastr.length;
        int arr[] = new int[index];

        for(int i = 0; i < index; i++)
        {
            arr[i] = Integer.parseInt(withoutcommastr[i]);
        }

        return arr;
    }

    int[] toSort(int[] arr)
    {
        int temps = 0;

        for(int i = 0; i<arr.length; i++)
        {
            for(int j = 0; j<arr.length; j++)
            {
                if(arr[j] >= arr[i])
                {
                    temps = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temps;
                }
                // System.out.println(arr[i]);
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        Array array = new Array();
        String values = "5,3,8,2,9";

        int arr[] = array.toCreate(values);

        int[] sort = array.toSort(arr);
        for(int i : sort)
        {
            System.out.print(i + " ");
        }
    }

    int toSearch(int[] arr, int search)
    {
        //Binary-Search method:-

        int firstindex, lastindex, index = 0;
        int searchnum = search;
        firstindex = 0;
        lastindex = arr.length-1;
        boolean check = false;

        while(firstindex <= lastindex)
        {
            int middleindex = (firstindex + lastindex)/2;
            if(arr[middleindex] == searchnum)
            {
                index = middleindex+1;
                check = true;
                break;
            }
            else if(arr[middleindex] <= searchnum)
            {
                firstindex = middleindex + 1;
            }
            else if (arr[middleindex] >= searchnum) 
            {
                lastindex = middleindex - 1;
            }
        }
        if(check == true)
        return index;

        return -1;
    }

    int[] toDelete(int[] arr, int delete)
    {
        int delnum = delete;
        int count = 0;

        outer: for(int i = 0; i<arr.length-1; i++)
        {
            count++;
            if(arr[i] == delnum)
            {
                arr[i] = 0;
                for(int j = count;j<arr.length;j++)
                {
                    int temps = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temps;
                    i++;
                }
                break outer;
            }
        }

        return arr;
    }

    int[] toReplace(int[] arr, int find, int replace)
    {
        int findnum = 0, replacenum = 0;
        findnum = find;
        replacenum = replace;
        
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] == findnum)
            {
                arr[i] = replacenum;
            }
        }

        return arr;
    }

    int[] toInsert(int[] arr, int index, int value)
    {
        int count = 0, insertindex = arr.length-1, insertvalue = 0;
        insertindex = index;
        insertvalue = value;

        for(int i = 0; i<arr.length; i++)
        {
            count++;
            if(i == (insertindex))
            {
                for(int j = arr.length-1; j>=count; j--)
                {
                    arr[j] = arr[j-1];
                }
                arr[count-1] = insertvalue;
                break;
            }
        }

        return arr;
    }
    
    int[] toSortAscending(int[] arr) {
        int temps = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= arr[i]) {
                    temps = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temps;
                }
            }
        }

        return arr;
    }

    int[] toSortDescending(int[] arr) {
        int temps = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] >= arr[j]) {
                    temps = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temps;
                }
            }
        }

        return arr;
    }

    int indexOf(int arr[], int value)
    {
        int index = 0;

        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] == value)
            {
                index = i;
                break;
            }
        }
        return index;
    }

    void toPrint(int arr[])
    {
        System.out.printf("\n[");
        for(int i:arr)
        {
            System.out.print(" "+i+" ");
        }
        System.out.printf("]\n");
    }

}