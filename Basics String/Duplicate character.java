import java.util.*;
class CountWords{
	public static void main(String[] args){
		boolean found=false;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any string ");
		String str=sc.nextLine();
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			for(int j=i+1;j<str.length();j++){
				if(ch==str.charAt(j)){
					found=true;
					System.out.println("Duplicate character in string :"+ch);
				}
			}
		}
		if(!found){
			System.out.println("Duplicate character not found :");
		}
	}
}
