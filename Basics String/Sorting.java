import java.util.*;
class DuplicateChar{
	public static void main(String[] args){
		boolean found=false;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first string ");
		String str1=sc.nextLine();
		str1=str1.replace(" ", "");
		int length=str1.length();
		
		char arr1[]=str1.toCharArray();
         
		Arrays.sort(arr1);
		for(int i=0;i<=length -1;i++){
			System.out.print(arr1[i]);
		}
	}
}


		



