//WAP to reverse a sentence while preserving the position.
//Input : “Think Twice”
//Output : “kniht eciwt”

package assignmentString;

class RevWords{	
	
	String reverseString(String str) {
		String revStr = "";
		for(int i=str.length()-1; i>=0; i--) {
			revStr = revStr + (char)str.charAt(i);
		}
		
		return revStr;
	}
	
	String reverseWords(String str) {
		String[] split = str.split(" ");
		String newStr = "";
		
		for(int i=0;i<split.length;i++) {
			newStr = newStr + reverseString(split[i]) + " ";
		}
		
		return newStr;
	}
		
}

public class Q2 {

	public static void main(String[] args) {
		
		RevWords rw = new RevWords();
		
		String str = "Think Twice";
		String newStr = rw.reverseWords(str);
		System.out.println(newStr);

	}

}
