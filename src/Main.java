import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\ntask 1:");
        List<Integer> nums = new ArrayList<>(List.of(10, 1, 2, 6, 3, 6, 4, 4, 5, 5, 5 ,8 ,6 , 7, 4, 3, 7));
        nums.stream().filter(n -> n % 2 != 0).forEach(System.out::print);

        System.out.println("\ntask 2:");

        Set<Integer> setNums = new HashSet<>(nums);
        setNums.stream().filter(n -> n % 2 == 0).sorted().forEach(System.out::print);

        System.out.println("\ntask 2:");
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(nums);
        linkedHashSet.stream().filter(n -> n % 2 == 0).sorted().forEach(System.out::print);

        System.out.println("\ntask 2:");
        TreeSet<Integer> treeSet = new TreeSet<>(nums);
        treeSet.stream().filter(n -> n % 2 == 0).sorted().forEach(System.out::print);

        System.out.println("\ntask 3:");

        List<String> strings = new ArrayList<>(List.of("Привет", "как", "дела", "Привет", "как", "дела", "Ура", "НеУра"));
        Set<String> treeSet2 = new TreeSet<>(strings);
        System.out.println(treeSet2);

        System.out.println("\ntask 3:");

        Map<String, Long> mapStrings = new HashMap<>();
        strings.forEach(s -> {
            mapStrings.put(s, strings.stream().filter(s::equals).count());
        });

        for (Map.Entry<String, Long> entry : mapStrings.entrySet()){
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + ' ');
            }
        }

        System.out.println("\ntask 4:");

        List<String> stringList = new ArrayList<>(List.of("один", "два","два", "три", "три", "три", "четыре", "пять", "пять", "два", "пять", "пять", "пять", "пять", "пять" ));

        Map<String, Long> map = new HashMap<>();
        stringList.forEach(s -> {
            map.put(s, stringList.stream().filter(s::equals).count());
        });
        System.out.println(map);
    }
}