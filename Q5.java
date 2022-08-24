//WAP to print repeatedly occurring characters in the given String.

package assignmentString;

public class Q5 {
	
	void printRepeated(String str)
	{
		str = str.toLowerCase();
		char charArr[] = str.toCharArray(); 
		
		System.out.println("Repeated Characters are:");
	      for (int i = 0; i < str.length(); i++) {
	         for (int j = i + 1; j < str.length(); j++) {
	            if (charArr[i] == charArr[j]) {
	               System.out.println(charArr[j] + " ");
	               break;
	            }
	         }
	      }
	}
	
	public static void main(String[] args) {
		
		String str = "iNeuron";
		
		Q5 pr = new Q5();
		
		System.out.println("The string is "+str);
		pr.printRepeated(str);
	}

}
