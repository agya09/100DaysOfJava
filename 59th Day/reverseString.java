import java.io.*;
import java.util.Scanner;

/**
 * reverseString
 */
public class reverseString {

    public static void main(String[] args) {
        String str="Hello World", new_str="";
        char ch;

        System.out.println("Original string: ");
        System.out.println("Hello World!");

        for(int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i);
            new_str= ch+new_str;
        }
        System.out.println("Reversed string is: "+ new_str);
    }
}