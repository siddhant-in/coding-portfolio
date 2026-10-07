public class Pattern2
{
    public static void main(String x[])
    {
        int k=5;
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {
                if(i%2==0 )
                {
                    System.out.print((k*i) +"  ");
                    
                }
                else if(j<=i || j>=i)
                {
                    System.out.print("#  ");
                    
                }
                
            }
            k--;
             System.out.println();
        }
    }
}