import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    protected  String text;
    Set <String> set = new HashSet<>();
    public WordsChecker (String text){
        this.text=text;
    }
    public boolean hasWord (String word){
        String [] words = text.split("\\P{IsAlphabetic}+");
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