package exception;

import java.net.SocketPermission;
import java.util.Scanner;

import javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder;

public class throwkey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("youre age ");
        int age = sc.nextInt();
        if (age < 18) 
        {
            // try {
                throw new youngageException("you'r not eligeble");
            // } catch (youngageException e) {
            //     System.out.println("you are not eligeble");
            // }
        } 
        else 
        {
            System.out.println("you are eligeble");
        }

    }

 

}

class youngageException extends ArithmeticException {
    youngageException(String msg) {
        super(msg);

    }

}
