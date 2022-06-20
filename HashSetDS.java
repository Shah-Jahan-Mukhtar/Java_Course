import java.util.HashSet;
import java.util.Iterator;

public class HashSetDS {
    public static void main(String[] args) {

        HashSet<String> cars = new HashSet<String>();

        cars.add("Toyota");
        cars.add("Mercedes Benz s-class");
        cars.add("Mercedes");

        cars.add("VOlkswagon");
        cars.add("VOlkswagon");

        cars.remove("VOlkskwagon");

        System.out.println(cars.contains("false"));
        System.out.println(cars.size());

        for (String i : cars) {
            System.out.println(i);
        }

        Iterator<String> it = cars.iterator();

        System.out.println(it.next());

        while (it.hasNext()) {
            System.out.println("IT:" + it.next());
        }

        HashSet<Integer> num = new HashSet<Integer>();

        num.add(45);
        num.add(60);
        num.add(10);
        Iterator<Integer> iter = num.iterator();

        while (iter.hasNext()) {
            Integer i = iter.next();
            if (i < 50) {
                iter.remove();
            }
        }
        System.out.println("cars:" + num);

    }
}
