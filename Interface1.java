import java.util.Scanner;

interface client
{
    void input();   //public +abstract
    void output();  //public + abstract

}
class Interface implements client{
    String name;
    double sal;
    public void input()
    {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter username");
        name = r.nextLine();

        System.out.println("Enter salary");
        sal = r.nextDouble();

    }

    public void output()
    {
        System.out.println(name+" "+sal);
    }

    public static void main(String[] args) {
        client c = new Interface();
        c.input();
        c.output();
    }
}
