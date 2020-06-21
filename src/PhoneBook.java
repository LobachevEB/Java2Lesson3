import java.util.*;

public class PhoneBook {
    private Map<String,TreeSet<String>> PhoneBook = new TreeMap<>();
    public void add(String name, String phone){
        TreeSet phones = PhoneBook.getOrDefault(name, new TreeSet<>());
        phones.add(phone);
        PhoneBook.put(name,phones);
    }
    public String[] get(String name){
        TreeSet phones = PhoneBook.get(name);
        String[] res = new String[0];
        if(phones == null){
            return null;
        }
        else {
            return (String[]) phones.toArray(new String[phones.size()]);
        }
    }
}
