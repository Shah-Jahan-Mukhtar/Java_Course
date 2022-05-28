public class MathR {
    
    public static void main(String [] args){
//         Math.max(x,y)

// The Math.max(x,y) method can be used to find the highest value of x and y:


int x=Math.max(5, 10);

System.out.println(x);


// Math.min(x,y)

// The Math.min(x,y) method can be used to find the lowest value of x and y:


int y=Math.min(5, 10);

System.out.println(y);



// Math.sqrt(x)

// The Math.sqrt(x) method returns the square root of x:


int z=Math.sqrt(64);

System.out.println(z);


// Math.abs(x)

// The Math.abs(x) method returns the absolute (positive) value of x:


Math.abs(-4.7);



Random Numbers

Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
Example

Math.random();



To get more control over the random number, e.g. you only want a random number between 0 and 100, you can use the following formula:
Example

int randomNum = (int)(Math.random() * 101);  // 0 to 100

    }
}
