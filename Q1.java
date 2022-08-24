//WAP to reverse a String.
//Input: “iNeuron”
//Output: “norueNi”

package assignmentString;

class RevString{
	
	String reverseString(String str) {
		String revStr = "";
		for(int i=str.length()-1; i>=0; i--) {
			revStr = revStr + (char)str.charAt(i);
		}
		
		return revStr;
	}
}


public class Q1 {
	
	public static void main(String[] args) {
		
		RevString rs = new RevString();
		
		String str = "iNeuron";
		String revStr = rs.reverseString(str);
		System.out.println(revStr);

	}

}
