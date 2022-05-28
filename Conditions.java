public class Conditions {
    
    public static void main(String[] args) {
        
// if
// if-else
// if-else-if
// switch
// ternary (?)

      System.out.print("Please enter first value the Values" +" \n" );
String text=System.console().readLine();
        System.out.print("Please enter second  the Values" +" \n" );

        String text2=System.console().readLine();

        Integer numb1=Integer.parseInt(text);
        Integer numb2=Integer.parseInt(text2);


if(numb1 > numb2){
    System.out.println("Number 1 is greater");
}else{
    System.out.println("Number 2 greater");
}

    }
}
