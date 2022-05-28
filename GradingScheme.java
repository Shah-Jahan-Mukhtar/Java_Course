import java.io.Console;

public class GradingScheme {
    public static void main(String[] args) {
        
System.out.println(
    
"Enter your marks to check the grade"
);
        String marks=System.console().readLine();

        Integer marksCheck=Integer.parseInt(marks);

        if(marksCheck >= 80 ){
            System.out.println("Your grade  is A");
        }
        else if(marksCheck >=70 ){
            System.out.println("Your grade is B");
        }
        else if(marksCheck >= 60){
            System.out.println("Your grade is C");

        }
        else if(marksCheck >=50) {
            System.out.println("Your grade is D");

        }else{
            System.out.println("Your grade is F");

        }
    }
    
}
