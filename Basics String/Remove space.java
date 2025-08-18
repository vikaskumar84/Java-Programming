import java.util.*;
class Spaceremove{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string ");
		String text=sc.nextLine();
		String nospace=text.replaceAll(" ","");
		System.out.print("remove space string "+nospace);
	}

}
