import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.nextLine().charAt(0);

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println("Character");
        }
        else if(ch >= '0' && ch <= '9'){
            System.out.println("Digit");
        }
        else{
            System.out.println("None");
        }
    }
}