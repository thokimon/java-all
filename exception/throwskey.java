package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class readandwrite {
    void readfile() throws FileNotFoundException
    {
        FileInputStream fis = new FileInputStream("/throwkey.ava");
    }
    void savefile() throws FileNotFoundException
    {
        FileInputStream fis = new FileInputStream("/throwkey.ava");
    }
}
class test{
    public static void main(String args[]){
        readandwrite file = new readandwrite();
        try{
        file.readfile();
        }
        catch(Exception e){
            System.out.println("file not found");


        }
    }
}
