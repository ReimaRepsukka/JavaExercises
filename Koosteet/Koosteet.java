import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Koosteet {
    public static void main(String[] args) {

        //Harj1
        List<String> lista = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lista.add("John Doe");
        }

        //Harj2
        lista.set(lista.size()-1, "Jack");
        //Harj3
        lista.add(5, "Paul");
        //Harj4
        lista.remove(3);
        //Harj5
        lista.add(0,"Simon");
        lista.add(0, "Lisa");

        //Harj6
        for (String name : lista) {
            System.out.println(name);
        }

        //Harj7
        if(lista.contains("Paul")){
            System.out.println("Löytyy");
        }

        //Harj8
        System.out.println("**********");
        lista.sort(Comparator.naturalOrder());
        for (String name : lista) {
            System.out.println(name);
        }

        //Harj9
        Integer[] x = {5,4,2,3,7,4,3,5,4};
        Integer[] y = {6,4,3,5,3,2,3,5,7};
        compareLists(Arrays.asList(x), Arrays.asList(y));

        //Harj10
        Scanner sc = new Scanner(System.in);
        Map<String,String> names = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Anna nimi:");
            String name = sc.nextLine();
            System.out.println("Anna lempinimi:");
            String nick = sc.nextLine();

            names.put(name, nick);
        }

        System.out.println("Anna etsittävä nimi:");
        String search = sc.nextLine();

        System.out.println("Lempinimi on " + names.get(search));

        for ( Map.Entry<String,String> pair : names.entrySet()) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }

    }

    static void compareLists(List<Integer> nums1,List<Integer> nums2 ){
        int matches = 0;

        //If one list is shorter, using that size for looping,
        int minLength = Math.min(nums1.size(), nums2.size());

        for (int i = 0; i < minLength; i++) {
            if(nums1.get(i) == nums2.get(i)){
                matches++;
            }
        }
        
        System.out.println("Taulukoista löytyi " + matches + " samaa arvoa samoissa indekseissä.");
    }
}
