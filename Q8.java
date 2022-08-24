//WAP to count number of special characters.


package assignmentString;

public class Q8 {
	
	void countSpecial(String str){
		int count =0;
		
		char [] charArr = str.toCharArray();
		
		for(int i=0; i<charArr.length; i++)
			if(charArr[i]<'0' || charArr[i]<'A'&&charArr[i]>'9' || charArr[i]>'Z'&&charArr[i]<'a' || charArr[i]>'z')
				count++;
		
		System.out.println(count);
	}

	public static void main(String[] args) {
		
		String str = "@i#N$e%u^r&o*n.";
		
		Q8 q8 = new Q8();
		
		System.out.println(str);
		q8.countSpecial(str);

	}

}
