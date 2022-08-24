package assignmentString;

public class Q7 {
	
	void count(String str1){
		
		int vowels = 0,consonants = 0;
		
		str1 = str1.toLowerCase();
		
		char [] charArr = str1.toCharArray();
		
		for(int i=0;i<charArr.length;i++) {
			
			//identify and count vowels
			if(charArr[i] == 'a' || charArr[i] == 'e' || charArr[i] == 'i' || charArr[i] == 'o' || charArr[i] == 'u')
				vowels++;
			
			
			//except vowels but falls in range of a-z count consonants
			else if(charArr[i]>='a' && charArr[i]<='z')
				consonants++;
		}
		
		System.out.println("Vowel count : " + vowels);
		System.out.println("Consonant count : " + consonants);
		
	}

	public static void main(String[] args) {
		
		String str1 = "The quick brown fox jumps over the lazy dog";
		String str2 = "iNeuron";
		
		System.out.println(str1);
		Q7 q7 = new Q7();
		q7.count(str1);
		
		System.out.println();
		
		System.out.println(str2);
		q7.count(str2);

	}

}
