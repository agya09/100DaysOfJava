import java.util.HashMap;

public class hashmap {

    public static void main(String[] args) {

        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("Nepal", "Kathmandu");
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Delhi");
        capitalCities.put("USA", "Washington DC");

        // printing all items of hashmap
        System.out.println(capitalCities);

        // accessing only one item from hashmap
        System.out.println(capitalCities.get("Nepal"));

        // removing item from hashmap
        capitalCities.remove("India");

        // after removing
        System.out.println(capitalCities);
    }

}
