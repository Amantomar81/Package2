// till java 1.7
interface i1            //inside the interface methods are public abstract
{
    // interface do not have a constructor
    public static final int a = 17;
    public abstract void m1();
}
class one implements i1
{
    @Override
    public void m1() {
        System.out.println("hello");
    }
}
public class Testing3 {
    public static void main(String[] args)
    {
        one obj2 = new one();
        i1 obj = new i1() {
            @Override
            public void m1() {
                System.out.println("Welcome to java class");
            }
        };
        obj.m1();
        obj2.m1();
    }
}
