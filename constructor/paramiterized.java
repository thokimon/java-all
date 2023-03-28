package constructor;

import java.util.Scanner;

public class paramiterized {

    paramiterized(int a,int b){
        System.out.println("value is  :"+(a+b));

    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int a = sc.nextInt();
        System.out.println("Enter b value");
        int b = sc.nextInt();
        paramiterized s = new paramiterized(a,b);
        
    }

    
}
