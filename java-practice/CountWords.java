public class CountWords {
    public static void main(String[] args) {
        String str = "Java Is A Programming Language";
        str = str.trim();
        if (str.isEmpty()) {
            System.out.println(0);
        }

        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                count++;
            }
        }
        System.out.println("Number of words in the string: " + (count));
    }
}

/*
 * public class CountWords {
 * public static void main(String[] args) {
 * String str = "Java Is A Programming Language , #";
 * 
 * int count = 0;
 * boolean inWord = false;
 * 
 * for (int i = 0; i < str.length(); i++) {
 * char ch = str.charAt(i);
 * 
 * if (Character.isLetter(ch)) {
 * if (!inWord) {
 * count++;
 * inWord = true;
 * }
 * } else {
 * inWord = false;
 * }
 * }
 * 
 * System.out.println("Number of words: " + count);
 * }
 * }
 */