import java.util.*;
public class RevWord
{  public static void main(String x[])
   {  Scanner xyz  = new Scanner(System.in);
      System.out.println("Enter first string");
	  String first=xyz.nextLine();
	  System.out.println("Enter second string");
	  String second=xyz.nextLine();
	  
	  if(first.length()!=second.length())
	  { System.out.println("Strings are not equal");
	  }
	  else
	  {  boolean flag=true;
	     for(int i=0;i<first.length();i++)
		 {
			   if(first.charAt(i)!=second.charAt(i))
			   { flag=false;
		          break;
			   }
		 }
		 if(flag)
		 { System.out.println("Strings are equal");
		 }
		 else
		 { System.out.println("Strings are not equal");
		 } 
	  }
   }
}
