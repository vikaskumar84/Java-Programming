import java.util.*;
class DuplicateChar{
	public static void main(String[] args){
		boolean found=false;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first string ");
		String str1=sc.nextLine();
		System.out.println("Enter second string ");
		String str2=sc.nextLine();
		if(str1.length()!=str2.length()){
			System.out.println("Not Anagram");
			return;
		}
		char arr1[]=str1.toCharArray();

		char arr2[]=str2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if(Arrays.equals(arr1,arr2)){
			System.out.println("Anagram string");
		}
		else{
			System.out.println("Not Anagram string");

		}	
		
	}
}


		



