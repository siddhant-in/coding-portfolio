public class UniString
{
    public static void main(String x[]){
        String str = "swiss";
        char c[] = str.toCharArray();

        int index = 0;
        int count = 0;
        for(int i=0; i<c.length; i++){
            if(c[i] != c[index]){
                count++;
                index++;
            }
            if(count == 1){
                System.out.println(c[i]+"");
            }
        }
    }
}
