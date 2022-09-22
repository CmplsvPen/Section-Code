import java.util.Scanner;


//it works!
public class printPalindrome {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.print("Type in a word: ");
            String word = console.next();

            if (isPalindrome(word)) {
                System.out.println("That's a palindrome!\n");
            } else System.out.println("That's not a palindrome.\n");
        }
    }
    private static boolean isPalindrome(String word){
        for (int i = 0; i< word.length(); i++){
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) return false;
        }
        return true;
    }
}
