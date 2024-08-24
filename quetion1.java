import java.util.Scanner;
class question1{

    public static int lengthLastWord(String s) {
        String trimmed = s.trim();
        int lastSpaceIndex = trimmed.lastIndexOf(' ');
        String lastWord = trimmed.substring(lastSpaceIndex + 1);
        return lastWord.length();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        int lengthOfLastWord = lengthLastWord(str);
        System.out.println(lengthOfLastWord);
    }
}