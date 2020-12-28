package pl.sztuczkap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

/*        // metoda of przed java 9
        List<String> names = new ArrayList<>();
        names.add();
        names.add();
        names.add();*/

        List<String> names = List.of("Ania", "Maria", "Sebastian", "Tadeusz");

        names.forEach(name -> {
            if (name.length() < 5) {
                System.out.println(name);
            }
        });

        // przetwarzamy elementy mapy
        Map<Integer, String> personMap = Map.of(1, "Michał", 2, "Ola", 3, "Marta");
        personMap.forEach((key, value) -> System.out.println(".forEach(): Index: " + key + " Imię: " + value));
        personMap.entrySet().forEach(entry -> System.out.println(".entrySet(): Index: " + entry.getKey() + " Imię: " + entry.getValue()));

    }
}
