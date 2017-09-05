import java.util.ArrayList;
import java.util.TreeMap;

public class PhoneBook {
    TreeMap<String, ArrayList<Integer>> phoneBooks=new TreeMap<>();
    protected PhoneBook(){
    }
    public void add(String name, Integer number){
        if(!this.phoneBooks.containsKey(name))   this.phoneBooks.put(name, new ArrayList<Integer>());
        this.phoneBooks.get(name).add(number);
    }
}
