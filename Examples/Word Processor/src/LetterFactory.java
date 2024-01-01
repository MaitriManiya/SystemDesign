import java.util.HashMap;
import java.util.Map;

public class LetterFactory {
    private static Map<Character, ILetter> characterCache = new HashMap<>();

    public static ILetter createLetter(char charValue){

        if(characterCache.containsKey(charValue)){
            return characterCache.get(charValue);
        }
        else {
            DocumentCharacter characterObj=new DocumentCharacter(charValue, "Arial", 10);
            characterCache.put(charValue, characterObj);
            return characterObj;
        }
    }
}
