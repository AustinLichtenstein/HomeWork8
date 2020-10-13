import java.util.Arrays;


public class sortOnName {
	
	public static void main(String []args) {
		String str[] = { "Genesis", "Exodus", "Numbers", "Leviticus"};
		String temp;
		System.out.println("Books in Alphabetical order:");
		for (int j = 0; j < str.length; j++) {
	   	   for (int i = j + 1; i < str.length; i++) {
			// comparing adjacent strings
			if (str[i].compareTo(str[j]) < 0) {
				temp = str[j];
				str[j] = str[i];
				str[i] = temp;
			}
		   }
		   System.out.println(str[j]);
		}
	   }
	}

	

