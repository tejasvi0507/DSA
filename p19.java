import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Tejasvi", 95);
        map.put("Tarun", 88);
        System.out.println(map.get("Tejasvi"));
        System.out.println(map.containsKey("Tarun"));
        map.remove("Tarun");
        System.out.println(map);
    }
}