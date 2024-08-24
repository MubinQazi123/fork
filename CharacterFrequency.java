import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "mubin kazi";
        
        
        Map<Character, Integer> charFrequency = new HashMap<>();
        
                char[] charArray = str.toCharArray();
        
        
        for (char ch : charArray) {
            
            if (charFrequency.containsKey(ch)) {
                charFrequency.put(ch, charFrequency.get(ch) + 1);
            } 
            
            else {
                charFrequency.put(ch, 1);
            }
        }
        
        
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
    }
}
