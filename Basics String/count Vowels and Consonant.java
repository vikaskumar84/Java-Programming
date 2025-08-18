import java.util.*;
class Count{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string ");
		String str=sc.nextLine();
		str=str.toLowerCase();
		str=str.replace(" ","");
		int vowelcount=0,consonantcount=0;
		
		for(int i=0;i<=str.length() -1;i++){
			char ch=str.charAt(i);
			if(ch=='a'|| ch=='e'|| ch=='i' || ch=='o' || ch=='u'){
				vowelcount+=1;
			}
			else{
				consonantcount+=1;
			}
		}
		System.out.println("count vowels in string :"+vowelcount);
		System.out.println("count consonants in string :"+consonantcount);

	}
}
