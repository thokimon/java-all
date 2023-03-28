package exception;
import java.io.FileInputStream;
import java.io.IOException;

class unchecked {
    public static void main(String args[])throws ArithmeticException  {
        // System.out.println(100/ 0000000);
       try {
        System.out.println(100/ 10);
       } catch (Exception arithmaException) {
        System.out.println("exception is :"+arithmaException);
       }
       finally{
        System.out.println("program is running sucssesfully");

       }




        
    }

    
}
