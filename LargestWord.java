public class LargestWord {
    public static void main(String[] args) {
        String str = "Hello my self mubin kazi ";
        
        String[] words = str.split(" ");  
        String largestWord = "";
        
        for (String word : words) {
            if (word.length() > largestWord.length()) {
                largestWord = word;
            }
        }
        
        System.out.println("Largest word in the string is: " + largestWord);
    }
}
