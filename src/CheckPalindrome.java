import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String word = scanner.next();
        int start = 0, end = word.length()-1;
        int output = findCheckPalindrome(word, start, end);
        System.out.println("Output : " + output);
    }

    private static int findCheckPalindrome(String word, int start, int end) {
        if(start >= end){
            return 1;
        }
        if (word.charAt(start) != word.charAt(end)){
            return 0;
        }
        return findCheckPalindrome(word, start+1, end-1);
    }
}
