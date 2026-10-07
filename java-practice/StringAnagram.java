import java.util.*;

public class StringAnagram {
	public void SortArray(char arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					char c = arr[i];
					arr[i] = arr[j];
					arr[j] = c;
				}
			}
		}
	}

	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";

		if (s1.length() != s2.length()) {
			System.out.println("Not Anagram");
			return;
		}

		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();

		StringAnagram sa = new StringAnagram();
		sa.SortArray(arr1);
		sa.SortArray(arr2);

		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}

	}
}