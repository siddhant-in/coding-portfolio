import java.util.Arrays;
public class Sorting
{
	public static void main(String []x){
		int arr[] = {9,4,3,7,3,4,51,35,9};
		
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++)
		System.out.print(arr[i]+" ");
	}
}