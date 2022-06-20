import java.util.LinkedList;

public class LinklistDS {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();

        cars.add("Civic");
        cars.add("V8");
        cars.add("Ford");
        cars.addFirst("Marcedes");
        cars.addLast("BMW");

        cars.removeFirst();
        cars.removeLast();

        cars.getFirst();

        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());

    }
}
