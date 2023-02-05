class Stack
{
    int stk[] = new int[10];
    int sindex;
    
    Stack()
    {
        sindex = -1;
    }

    int toPush(int value)
    {
        if(sindex == 9)
        {
            System.out.println("Stack overflow.");
        }
        else
        {
            stk[++sindex] = value;
        }
        return sindex;
    }

    int toPop()
    {
        int value = 0;

        if(sindex < 0)
        {
            System.out.println("Stack underflow");
        }
        else
        {
            value = stk[sindex--];
        }
        return value;
    }
}
