package exception;

import java.io.FileInputStream;
import java.io.FileReader;

class checked {
    public static void main(String args[]){

    try {
        FileInputStream file = new FileInputStream("/ad.java");
    } catch (Exception e) {
        System.out.println("This is the checked exception in java exception handling");
    }
}
    
}
