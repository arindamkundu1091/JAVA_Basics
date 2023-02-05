class SuperClass
{
    int i,j,k;
    SuperClass(int a,int b,int c)
    {
        i = a;
        j = b;
        k = c;
    }
    void add()
    {
        int sum = i+j+k;
        System.out.println("The sum is "+sum);
    }
    void mul()
    {
        int mu = i*j*k;
        System.out.println("The multipilication is "+mu);
    }
    
}
class SubClass extends SuperClass
{
    int p,q;
    SubClass(int x,int y,int u,int v,int w)
    {
        super(u,v,w);
        p = x;
        q = y;
    }
    void sub()
    {
        int su = p-q;
        System.out.println("The substraction is "+su);
    }
    void div()
    {
        int di = p/q;
        System.out.println("The division is "+di);
    }
}
class Run extends SubClass
{
    Run(int x1, int y1, int u1, int v1, int w1)
    {
        super(x1,y1,u1,v1,w1);
    }
    public static void main(String[] args) 
    {
        Run r = new Run(10,20,30,40,50);

        r.add();
        r.mul();
        r.sub();
        r.div();
    }
}