package Strings;
import javax.print.DocFlavor.STRING;

public class StringsJava {

    public static void main(String [] args) {
     
//         Strings are used for storing text.

// A String variable contains a collection of characters surrounded by double quotes:

String str="Hello world";

        System.out.println(str);



// String Length

// A String in Java is actually an object, which contain methods that can perform certain operations on strings. For example, the length of a string can be found with the length() method:


String len="This is some text we executed";

System.out.println(len.length());



// More String Methods

// There are many string methods available, for example toUpperCase() and toLowerCase():


String txt="This is text that is going to be change";
System.out.println(txt.toLowerCase());
System.out.println(txt.toUpperCase());


// Finding a Character in a String

// The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):


String ind="Location of system";

System.out.println(ind.indexOf("of"));


    }


}