//WAP to check if the String is a Pangram or not.

package assignmentString;

public class Q4 {
	
	boolean isPanagram(String str1) {
		
		boolean result = false;
		
		str1 = str1.toLowerCase();
		
		int count = 0;
		
		for (char ch = 'a'; ch <= 'z'; ch++)
            if (str1.contains(String.valueOf(ch)))
                count++;
		
		if(count == 26)
			result = true;
		
		return result;
		
	}

	public static void main(String[] args) {
		
		String str1 = "The quick brown fox jumps over the lazy dog";
		String str2 = "iNeuron";
		
		Q4 isPan = new Q4();
		
		boolean result1 = isPan.isPanagram(str1);
		boolean result2 = isPan.isPanagram(str2);
		
		if(result1)
			System.out.println("/* " + str1 + " */" + " is a Panagram");
		else
			System.out.println("/* " + str1 + " */"+ " is not a Panagram");
		
		if(result2)
			System.out.println("/* " + str2 + " */" + " is a Panagram");
		else
			System.out.println("/* " + str2 + " */" + " is not a Panagram");		

	}

}
