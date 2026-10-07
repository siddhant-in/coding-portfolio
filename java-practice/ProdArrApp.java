import java.util.*;
class Product
{ private int id;
  private String name;
  private int price;
  public void setId(int i)
  {  id=i;
  }
  public int getId(){
     return id;
  }
  public void setName(String n)
  { name=n;
  }
  public String getName(){
     return name;
  }
  public void setPrice(int p){
    price=p;
  }
  public int getPrice(){
    return price;
  }
}
class Shop
{
    void searchProduct(Product p[],int id)
	{   int index=-1;
	    for(int i=0; i<p.length;i++)
		{
		   int prodId=p[i].getId();
		   if(prodId==id)
		   {  index=i;
			  break;
		   }
		}
		if(index!=-1)
		{ System.out.println(p[index].getId()+"\t"+p[index].getName()+"\t"+p[index].getPrice());
		}  
		else{
		 System.out.println("Product Not Found");
		} 
	}
}
public class ProdArrApp
{   public static void main(String ...x)
	{ Scanner xyz  = new Scanner(System.in);
	    Shop s1 = new Shop();
		Product prod[]=new Product[3];// array of reference.
		for(int i=0; i<prod.length; i++)
		{
		    prod[i]=new Product();
			System.out.println("Enter name id and price of product");
			String name=xyz.nextLine();
			int id=xyz.nextInt();
			int price=xyz.nextInt();
			prod[i].setName(name);
			prod[i].setId(id);
			prod[i].setPrice(price);
			xyz.nextLine();
		}
		System.out.println("Enter id for search product");
		int productId=xyz.nextInt();
		s1.searchProduct(prod,productId);
	}
}
