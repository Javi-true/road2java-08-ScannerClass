import java.util.*;

public class ScannerTest {

    //This is s program for testing scanner class.
    public static void main(String[] args){
        Scanner input1 = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input1.next();
        System.out.println("Your name is: " + name);


    }
}
