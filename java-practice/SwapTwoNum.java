public class SwapTwoNum
{
    public static void main(String ...x)
    {
        int A=10;
        int b=5;

        A = A ^ b;
        b = A ^ b;
        A = A ^ b;

        System.out.print("A = "+A+"\tB = "+b);
    }
}