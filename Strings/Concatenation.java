package Strings;

public class Concatenation {
 
    
public static void main(String [] args){

// String Concatenation

// The + operator can be used between strings to combine them. This is called concatenation:


    String fname="Ali";
    String lname="Hassan";
    String roll="19014156";

    System.out.println( "FullName: "+ fname + " "+lname);

    // You can also use the concat() method to concatenate two strings:

    System.out.println(fname.concat(" "+lname+" "+roll));

}

}
