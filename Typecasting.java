public class Typecasting {


    public static void main(String [] args){

// Widening Casting

// Widening casting is done automatically when passing a smaller size type to a larger size type:

        int var=45;
        double dub=var;

        System.out.println(dub);



        
//         Narrowing Casting

// Narrowing casting must be done manually by placing the type in parentheses in front of the value:


double var2=8.658;
int var3=(int) var2;

System.out.println(var3);


    }
    
}
