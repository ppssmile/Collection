import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] a = {"1", "2", "3", "4", "5", "5", "5", "6", "7", "8"};
        HashMap<String, Integer> hash = new HashMap<>();
        System.out.println("Exclusive key: ");
        for (int i = 0; i < a.length; i++) {
            if(hash.get(a[i])==null) System.out.print(a[i]+", ");
            hash.put(a[i], hash.get(a[i]) == null ? 1 : hash.get(a[i]) + 1);
        }
        System.out.println();
        System.out.println("Contains key and number contains: ");
        System.out.print(hash);
    }
}