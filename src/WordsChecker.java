import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    private Set<String> set = new HashSet<>();

    public WordsChecker(String text) {
        String[] words = text.split("\\P{IsAlphabetic}+");
        for (String newWord : words) {
            set.add(newWord);
        }
    }

    public boolean hasWord(String word) {
        if (set.contains(word)) {
            System.out.println("Cлово "+ word +" есть!");
            return true;
        }
        System.out.println("Cлова " + word + " нет(");
        return false;
    }
}
