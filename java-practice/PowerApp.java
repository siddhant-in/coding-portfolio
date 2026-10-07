import java.util.*;
class Power {
		private int base;
		private int index;
		
		Power(int base, int index)
			{
				this.base = base;
				this.index = index;
			}
			
		 int getPower(){
			double pow = Math.pow(base, index);
        return (int) pow; 
		}	

}	
		public class PowerApp
		{
			public static void main(String x[])
			{
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter the base and index: ");
					int base = sc.nextInt();
					int index = sc.nextInt();
					
					Power p = new Power(base,index);
					int result = p.getPower();
					System.out.println("Result \t"+result);
			}
		}
