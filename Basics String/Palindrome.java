import java.util.*;
public class PalindromeString{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string ");
		String str=sc.nextLine();
        String reverse="";
		str=str.replace(" ","");

		for(int i=str.length() -1;i>=0;i--){
            reverse= reverse + str.charAt(i);
        }
		if(str.equalsIgnoreCase(reverse)){
			System.out.println("palindrome string ");
		}
		else{
			System.out.println("Not palindrome string ");
		}
	}

}
