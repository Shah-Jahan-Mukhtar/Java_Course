
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListTask {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");

        cars.add("Toyota");
        cars.add("BMW");

        cars.set(1, "VW");

        // cars.remove(1);
        // cars.clear();
        System.out.println(cars.get(1));

        System.out.println(cars.size());
        Collections.sort(cars);
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        ArrayList<Integer> num = new ArrayList<Integer>();

        num.add(1);
        num.add(4);
        num.add(3);

        num.add(2);
        num.add(5);
        num.add(6);

        for (Integer i : num) {
            System.out.println(i);
        }

        Collections.sort(num);

        for (Integer i : num) {
            System.out.println(i);
        }

    }

}
