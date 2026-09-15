import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Vhea");
        names.add("Radaza");
        names.add("Flor");
        names.addFirst("Gamay");
        names.addLast("Jusay");

        System.out.println(names);

        names.set(0, "Darna");

        System.out.println(names.contains("Flor"));

        names.remove("Jusay");

        System.out.println(names.isEmpty());

        // names.clear();

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}