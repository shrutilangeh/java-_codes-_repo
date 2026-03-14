import java.util.Scanner;
class Sentence {
    String text;
    Sentence(String t) {
        text = t;
    }

    void countWords() {
        String[] words = text.split("");
        System.out.println("Number of words: " + words.length);
    }
}
public class Wordscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();
        Sentence sentence = new Sentence(input);
        sentence.countWords();
    }
}