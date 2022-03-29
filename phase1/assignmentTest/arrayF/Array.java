package arrayF;

public class Array {

	public static void main(String[] args) {
			int [] Arr1= {10,15,35,45};
			int [] Arr2= {30,50,40,55};
			int[] arr3=new int[4];
			for(int i=0;i<Arr1.length;i++) {
				arr3[i]=Arr1[i]+Arr2[i];
			}
			for(int i=0;i<Arr1.length;i++) {
				System.out.println(arr3[i]);
			}
	}
}
			
     
			

