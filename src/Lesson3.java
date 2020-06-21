import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lesson3 {
    static public void main(String[] args){
        wordsArrayTask();

        PhoneBook Book = new PhoneBook();
        Book.add("Иванов","+79000010203");
        Book.add("Иванов","+79053610278");
        Book.add("Петров","+74957235547");
        printPhone("Сидоров",Book);
        printPhone("Иванов",Book);
        printPhone("Петров",Book);
    }

    static void printPhone(String name,PhoneBook Book){
        String[] p = Book.get(name);
        if (p != null){
            System.out.printf("%s %s\n",name,String.join(",",p));
        }
        else {
            System.out.printf("Не найден контакт %s\n",name);
        }

    }

    static void wordsArrayTask(){
        String[] Words = {"слон","шахта","парабеллум","синий","четырнадцать","покахонтас","вылететь","волторна","синий",
        "пень","пень","пень","находка","слон","стол"};
        Map<String, Integer> WordMap = new HashMap<>();
        Set<String> UniqueWords = new HashSet<>();
        for (String word: Words) {
            int count = WordMap.getOrDefault(word,0);
            count++;
            WordMap.put(word,count);
        }
        WordMap.forEach((k,v)->{
            if(v == 1){
                UniqueWords.add(k);
            }
        });
        System.out.printf("Уникальные слова: %s\n",UniqueWords.toString());
        System.out.printf("Список с количествами: %s\n",WordMap.toString());

    }
}
