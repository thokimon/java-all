import java.util.Scanner;

public class dn {

    public static void main(String[] args) {
    //     Scanner scan = new Scanner(System.in);
    //     System.out.println("i");
    //     int i = scan.nextInt();
    //     System.out.println("d");
    //     double d = scan.nextDouble();
    //     System.out.println("s");
    //     String s = scan.nextLine();

    //     System.out.println("String: " + s);
    //     System.out.println("Double: " + d);
    //     System.out.println("Int: " + i);
    // }
    Scanner scanner = new Scanner(System.in);

        // read a String from stdin and print it
        String str = scanner.nextLine();
        System.out.println("String: " + str);

        // read a double from stdin and print it
        double dbl = scanner.nextDouble();
        System.out.println("Double: " + dbl);

        // read an int from stdin and print it
        int num = scanner.nextInt();
        System.out.println("Int: " + num);

        scanner.close();
    }
}