public class Convert_String {
    public static void main(String[] args) {
        String input = "Java is fun";
        String[] words = input.split(" ");
        String str = "";

        for (String word : words) {
            // Reverse each word manually
            for (int i = word.length() - 1; i >= 0; i--) {
                str += word.charAt(i);
            }
            str += " ";
        }
        System.out.println(str);
    }

}
