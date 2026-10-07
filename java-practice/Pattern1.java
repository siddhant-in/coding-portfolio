public class Pattern1
{
    public static void main(String x[])
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=9; j++)
            {
                if(i>=j)
                {
                     System.out.print(i+"  ");
                }
                else if(j%2==0)
                {
                    System.out.print("# ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}