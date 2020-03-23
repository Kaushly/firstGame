package gamefight;

import java.util.*;

public class Maoo {
    public static void main(String[] args) {
        Byte as;
        Character charName; //65000
        Integer a;
        String st;
        Boolean tr;
        Double doubleName;
        Float flo;
        Long sa;
//list

        List<Integer> numbers = new ArrayList<>();
        List<String> personsName = new ArrayList<>();
        personsName.add("Vasay");
        personsName.add("Lisa");
        personsName.add("Nikita");
        personsName.add("Aleksey");
        personsName.add("Yakov");

        for (String s : personsName) {
            System.out.println(s);
        }

        System.out.println();
        for (int i = 0; i < personsName.size(); i++) {
            System.out.println(personsName.get(i));
        }
        System.out.println();
        personsName.forEach(System.out::println);
        System.out.println();
        List<String> personLinkName = new LinkedList<>();
        personLinkName.add("Vasay");
        personLinkName.add("Lisa");
        personLinkName.add("Nikita");
        personLinkName.add("Aleksey");
        personLinkName.add("Yakov");
        personLinkName.add("Yakov");


        //todo  легко добавить элементы,

        for (String s : personLinkName) {
            System.out.println(s);
        }


        System.out.println();
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Vasay");
        hashSet.add("Lisa");
        hashSet.add("Nikita");
        hashSet.add("Aleksey");
        hashSet.add("Yakov");
        for (String s : hashSet) {
            System.out.println(s);
        }
        System.out.println();
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Vasay");
        treeSet.add("Lisa");
        treeSet.add("Nikita");
        treeSet.add("Aleksey");
        treeSet.add("Yakov");
        for (String s : treeSet) {
            System.out.println(s);
        }
        Set<String> linkedHashSet = new LinkedHashSet<>();
        System.out.println();
        linkedHashSet.add("Vasay");
        linkedHashSet.add("Lisa");
        linkedHashSet.add("Nikita");
        linkedHashSet.add("Aleksey");
        linkedHashSet.add("Yakov");
        for (String s : linkedHashSet) {
            System.out.println(s);
        }


        Map map  = new HashMap();
    }
}
