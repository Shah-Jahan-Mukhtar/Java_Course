public class Arrays {
    public static void main(String[] args) {

        // 1D arrays
        String [] name={"Suleman","Saad","Hamayun","Jami"};


for(int i = 0;i<name.length;i++){
    System.out.println(name[i]);
}


// Loop Through an Array with For-Each

// There is also a "for-each" loop, which is used exclusively to loop through elements in arrays:

for(String i :name){
    System.out.println(i);
}

        // 2D Arrays
        
        Integer [][] marks={
            {10,20,40},
            {10,20,40,50},
            {10,30,60,40},
            {10,30,20,10}
        };

        System.out.print(marks[2][3]);


        for(int i=0;i<marks.length;++i){
            for(int j=0;j<marks[i].length;++j){
                System.out.println(marks[i][j]);
            }
        }
    }
}
