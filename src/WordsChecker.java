import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    private   String text;
    private String [] words = text.split("\\P{IsAlphabetic}+");
    private Set <String> set = new HashSet<>();
    public WordsChecker (String text){
        this.text=text;
    }
    public boolean hasWord (String word){
        for (String newWord:words) {
            set.add(newWord);
        }
        if (set.contains(word)){
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }
}
