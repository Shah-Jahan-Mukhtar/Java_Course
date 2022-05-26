package Strings;

public class SpecialCharcters {
    



public static void main(String [] args){


//     Special Characters
// Because strings must be written within quotes, Java will misunderstand this string, and generate an error:



// String txt = "We are the so-called "Vikings" from the north.";


// The solution to avoid this problem, is to use the backslash escape character.

// The backslash (\) escape character turns special characters into string characters:
// Escape character 	Result 	Description
// \' 	' 	Single quote
// \" 	" 	Double quote
// \\ 	\ 	Backslash



String text="This is some \"Special\" text";
String text1="This is some \'Special\' text";


String text2="This is some \\Special text";
String text3="This is some \r Special text";


String text4="This is New \t Special text";

String text5="This is New \b Special text";

String text6="This is New \f Special text";






System.out.println(text);

System.out.println(text1);


System.out.println(text2);
System.out.println(text3);

System.out.println(text4);
System.out.println(text5);
System.out.println(text6);









}

}
