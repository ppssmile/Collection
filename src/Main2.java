import java.util.ArrayList;
import java.util.TreeMap;

public class Main2 {
    public static void main(String[] args) {
        PhoneBook phoneBooks = new PhoneBook();
        for(int i=0; i<20;i++){
            phoneBooks.add("name"+i, 123123);
        }
        phoneBooks.add("name1", 293943017);
        phoneBooks.add("name4", 293943017);
        phoneBooks.add("name4", 293943017);
        phoneBooks.add("name4", 293943017);
        phoneBooks.add("name19", 293943017);

        System.out.println(phoneBooks.phoneBooks.get("name1"));

        for (int i=0;i<phoneBooks.phoneBooks.size();i++) {
            System.out.println(phoneBooks.phoneBooks.ceilingEntry("name"+i));
        }
    }
}
