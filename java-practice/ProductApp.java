class Product {
		private int id;
		private String name;
		private int price;
		
		public void setId(int id) {
			this.id = id;
		}
		public int getId() {
			return id;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getPrice() {
			return price;
		}
	}
	
class  ProductCatalog {
	Product products[];
	
		 ProductCatalog(Product products[]){
				this.products = products;
			}
			
		void displayProductCatalog() {
			for(int i=0; i<products.length; i++)
				{
					System.out.println(products[i].getId()+"\t\t"+products[i].getName()+"\t\t"+products[i].getPrice());
				}
		}
		
		int getProductCatalog() {
				int total = 0;
				for(int i =0; i<products.length; i++)
				{
					total = total + products[i].getPrice();
				}
				 
				return total;
		}
}

public class ProductApp {
	public static void main(String x[])
	{
		Product p1 = new Product();
		p1.setId(1);
		p1.setName("Fabric");
		p1.setPrice(100);
		
		Product p2 = new Product();
		p2.setId(2);
		p2.setName("Thread");
		p2.setPrice(200);
		
		Product[] productArr = {p1,p2};
		ProductCatalog pc = new ProductCatalog(productArr);
		System.out.println("Id\tName\tPrice");
		pc.displayProductCatalog();
		int result = pc.getProductCatalog();
		System.out.println("Total price "+result);
	}
}
		
			
		
		
		
	
		