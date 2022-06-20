import java.util.HashMap;

import javax.print.attribute.standard.MediaSize.Engineering;

public class HashMapsDs {

    public static void main(String[] args) {
        HashMap<String, String> capitals = new HashMap<String, String>();

        capitals.put("Engineering", "Mechanical");
        capitals.put("England", "london");
        capitals.put("Pakistan", "Islamabad");

        // capitals.remove("England");
        System.out.println(capitals.get("England"));
        System.out.println(capitals.size());

        for (String i : capitals.keySet()) {
            System.out.println("key:" + i + " values :" + capitals.get(i));
        }

        for (String i : capitals.values()) {
            System.out.println(i);
        }
    }
}
