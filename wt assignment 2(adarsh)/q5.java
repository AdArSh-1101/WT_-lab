import java.util.Scanner;

public class q5  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.println("Enter word to be replaced: ");
        String replacing_word = scanner.next();
        System.out.println("Enter replacing word: ");
        String replaced_word = scanner.next();
        if(str.contains(replacing_word)){
            String replacedStr = str.replace(replacing_word, replaced_word);
            System.out.println("After replacing: " + replacedStr);
        }
        else{
            System.out.println("Word not found in string.");
        }


        String trimmedStr = str.trim();
        System.out.println("After trimming: " + trimmedStr);


        // String[] splitStr = str.split("\\s+");
        String[] splitStr = str.split(" ");
        System.out.print("After splitting: ");
        for (String s : splitStr) {
            System.out.print(s + ", ");
        }
        System.out.println();

        char ch = str.charAt(5);
        System.out.println("Character at index 5: " + ch);


        String subStr = str.substring(14, 21);
        System.out.println("Substring from index 14 to 21: " + subStr);
    }
}