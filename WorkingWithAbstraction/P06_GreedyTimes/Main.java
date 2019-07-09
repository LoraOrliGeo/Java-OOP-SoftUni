package WorkingWithAbstraction.P06_GreedyTimes;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static long capacityTaken = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long bagCapacity = Long.parseLong(scanner.nextLine());

        String[] items = scanner.nextLine().split("\\s+");

        Map<String, Map<String, Long>> bag = new LinkedHashMap<>();

        long gold = 0;
        long gems = 0;
        long cash = 0;

        bag.put("Gold", new LinkedHashMap<>());
        bag.put("Gem", new LinkedHashMap<>());
        bag.put("Cash", new LinkedHashMap<>());

        for (int i = 0; i < items.length; i += 2) {
            String type = items[i];
            long quantity = Long.parseLong(items[i + 1]);

            if (type.length() == 3) {
                type = "Cash";
            } else if (type.toLowerCase().endsWith("gem")) {
                type = "Gem";
            } else if (type.toLowerCase().equals("gold")) {
                type = "Gold";
            }

            String name = items[i];

            if (bagCapacity >= capacityTaken + quantity) {
                if (type.equals("Gem") && gold >= gems + quantity) {
                    gems += quantity;
                    addItems(bag, type, name, quantity);
                } else if (type.equals("Cash") && gems >= cash + quantity) {
                    cash += quantity;
                    addItems(bag, type, name, quantity);
                } else if (type.equals("Gold")) {
                    gold += quantity;
                    addItems(bag, type, name, quantity);
                }
            }
        }

        for (Map.Entry<String, Map<String, Long>> x : bag.entrySet()) {
            Long sumValues = x.getValue().values().stream().mapToLong(e -> e).sum();

            if (!x.getValue().isEmpty()) {
                System.out.println(String.format("<%s> $%s", x.getKey(), sumValues));

                x.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey()))
                        .forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));
            }
        }
    }

    private static void addItems(Map<String, Map<String, Long>> bag, String type, String name, long quantity) {
        if (!bag.get(type).containsKey(name)) {
            bag.get(type).put(name, quantity);
        } else {
            bag.get(type).put(name, bag.get(type).get(name) + quantity);
        }

        capacityTaken += quantity;
    }
}
