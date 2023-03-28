import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class hello {
    hello(int a, int b) {

        try 
        {
            System.out.println("dividing two numbers given is :" + (a / b));
            System.out.println("dividing two numbers given is :" + (a * b));
            System.out.println("dividing two numbers given is :" + (a + b));
            System.out.println("dividing two numbers given is :" + (a - b));

        } catch (Exception e) 
        {
            // e.printStackTrace();
            System.out.println(e.toString());

        }

    }

    public static void main(String args[])
    {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first amount");
            int a = sc.nextInt();
            System.out.println("Enter second amount");
            int b = sc.nextInt();

            hello ad = new hello(a, b);

        } 
        catch (InputMismatchException f) 
        {
            System.out.println("invalid input String ");
        }
    }
}

     


        

        
  


