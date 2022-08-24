//WAP to check if the String is Anagram or not.

package assignmentString;
import java.util.Arrays;

public class Q3 {
	
	boolean isAnagram(String str1, String str2) {
		
		str1 = str1.toLowerCase();
	    str2 = str2.toLowerCase();
	    
	    boolean result = false;

	    if(str1.length() == str2.length()) {

	      char[] charArray1 = str1.toCharArray();
	      char[] charArray2 = str2.toCharArray();

	      Arrays.sort(charArray1);
	      Arrays.sort(charArray2);

	      result = Arrays.equals(charArray1, charArray2);
	    }
	    
	    return result;
	}
	
	public static void main(String[] args) {
		
		String str1 = "Elbow";
		String str2 = "Below";
		
		String str3 = "Cat";
		String str4 = "bat";
		
		Q3 isAn = new Q3();
		
		boolean result = isAn.isAnagram(str1, str2);
		
		if(result)
			System.out.println(str1 + " " + str2 + " are Anagrams");
		
		else
			System.out.println(str1 + " " + str2 + " are not Anagrams");
		
		////
		boolean result1 = isAn.isAnagram(str3, str4);
		
		if(result1)
			System.out.println(str3 + " " + str4 + " are Anagrams");
		
		else
			System.out.println(str3 + " " + str4 + " are not Anagrams");
	}

}
