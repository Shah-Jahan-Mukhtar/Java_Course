public class Typecasting {


    public static void main(String [] args){



// Type casting is when you assign a value of one primitive data type to another type.

// In Java, there are two types of casting:

//     Widening Casting (automatically) - converting a smaller type to a larger type size
//     byte -> short -> char -> int -> long -> float -> double

//     Narrowing Casting (manually) - converting a larger type to a smaller size type
//     double -> float -> long -> int -> char -> short -> byte 


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
