public class LPS{
    public static void main(String args[]){
        String t = "BABABABABCABABCABAB";
        String l ="ABABCABAB";

        char text[] = t.toCharArray();
        int n = text.length;
        int m = l.length();
        int lps [] = new int[0 * m];

        int j=0;
        int i=1;

        while(i < m){
                if(text[i] == text[j]){
                    j += 1;
                    lps[i] = j;
                    i += 1;
                }
                else{
                    if(j != 0){
                        j = lps[j-1];
                    }
                    else{
                        lps[i] = 0;
                        i += 1;
                    }
                }
        }
        System.out.println(lps);
    }
}