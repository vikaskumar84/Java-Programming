public class DuplicateNum{
	public static void main(String[] args){
		boolean found=false;
		int arr[]={1,2,5,4,5};
		for(int i=0;i<5;i++){
			for(int j=i+1;j<5;j++){
				if(arr[i]==arr[j]){
					found=true;
					System.out.println(arr[i]+" is duplicate number "+"with indexing "+i);
				}
			}
		}
		if(!found){
			System.out.println("Duplicate Numbers not found in array");
		}

	}
}
