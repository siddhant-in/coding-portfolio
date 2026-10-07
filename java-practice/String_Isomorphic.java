public class String_Isomorphic {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        if (s.length() != t.length()) {
            System.out.println("Not Isomorphic");
            return;
        }

        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (mapS[c1] == 0 && mapT[c2] == 0) {
                mapS[c1] = c2;
                mapT[c2] = c1;
            } else if (mapS[c1] != c2 || mapT[c2] != c1) {
                System.out.println("Not Isomorphic");
                return;
            }
        }

        System.out.println("Isomorphic");
    }
}

/*class Main {
    public static boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()) return false;

        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for(int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(mapS[c1] != mapT[c2]) {
                return false;
            }

            // store current index + 1
            mapS[c1] = i + 1;
            mapT[c2] = i + 1;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add")); // true
    }
} */