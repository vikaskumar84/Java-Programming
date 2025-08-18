import java.util.*;
class CountWords{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string ");
		String str=sc.nextLine();
		String words[] =str.split(" ");
		System.out.println("count the words in string :"+words.length);

	}
}
