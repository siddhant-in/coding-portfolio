import java.util.*;
class InsertArray
{
   public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[6];
        int i,value,index;
        System.out.println("Enter 5 elements");
         for(i=0;i<a.length-1;i++)
           a[i]=sc.nextInt();
         System.out.println("Enter value and index to be inserted");
          value=sc.nextInt();
           index=sc.nextInt();
        for(i=a.length-1;i>index;i--)
         {
             a[i]=a[i-1];    
          }
    a[index]=value;
   System.out.println(" ");
      for(i=0;i<a.length;i++)
       System.out.print("  "+a[i]);
    }
}
