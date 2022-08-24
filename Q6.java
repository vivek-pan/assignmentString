//WAP to sort a String Alphabetically.

package assignmentString;

import java.util.Arrays;

public class Q6 {
	
	void sortString(String str1) {
		
		char[] charArr = str1.toCharArray();
		
//		Arrays.sort(charArr);

		//bubble sort
		for(int i=0;i<charArr.length;i++) 
			for(int j=1;j<charArr.length;j++) 
				if(charArr[i]>charArr[j]) {
					char temp = charArr[i];
		            charArr[i] = charArr[j];
		            charArr[j] = temp;
				}
		
		System.out.println(new String(charArr));
			
		
		
		
	}
	
	public static void main(String[] args) {
		
		String str1 = "ineuron";
		
		Q6 q6 = new Q6();
		
		q6.sortString(str1);
	}

}
