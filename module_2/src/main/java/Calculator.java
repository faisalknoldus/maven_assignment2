
public class Calculator {
    public void add(int x, int y)
    {
        System.out.println("Sum is:"+(x+y));
    }
    public void sub(int x, int y)
    {
        System.out.println("Difference is:"+(x-y));
    }
    public void mul(int x, int y)
    {
        System.out.println("Product is:"+(x*y));
    }
    public void div(int x, int y)
    {
        if(y!=0)
            System.out.println("Division is :"+(x/y));
        else
            System.out.println("Denominator can't be Zero!");

    }

}
