package programmin_Interview;

public class ReverseString {

    public static void main(String[] args) {

        // 1. Reverse a single word
        String str = "Java";
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        System.out.println("Reverse of 'Java' is: " + result);

        // 2. Reverse a sentence word by word
        String sent = "I love java very much";
        String[] words = sent.split(" ");
        String reverse = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reverse += words[i] + " ";
        }

        System.out.println("Reverse of the sentence is: " + reverse.trim());
    }
}


