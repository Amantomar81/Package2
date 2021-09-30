/*Annoymous nested class
abstract
interface
if you do not know the behaviour declare method with abstract modifier
if a class is having abstract method then it is mendatory to create the class with abstract modifier.
 */
//single level inheritance
abstract class Result
{
    abstract void calculateResult();                 //declare method
}
// extends is a keyword
//class Second extends Result
//{
//    public void calculateResult()
//    {
//        System.out.println("Welcome");
//    }
//}cle

public class TestAnonymousclass
{
    public static void main(String[] args)
    {
      Result obj1 = new Result() 
      {
          @Override
          void calculateResult() 
          {
              System.out.println("Hello");
          }

      };    //name less class
        Result obj2 = new Result()
        {
            @Override
            void calculateResult() 
            {
                System.out.println("Welcome");
            }
        };

       /*
       object arr[] = new object[5];
       arr[0] = new String();
       arr[1] = new Result();
               */
    }
}
