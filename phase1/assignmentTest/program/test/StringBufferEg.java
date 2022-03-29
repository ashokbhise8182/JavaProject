package program.test;

public class StringBufferEg {

	public static void main(String[] args) { 
			
			StringBuffer s=new StringBuffer("Started Java"); 
			
			s.append("Phase1");          
			System.out.println("after appending"+ s);     
			
			s.delete(2,5);  
			System.out.println("after deleting"+ s);
			
			s.replace(9,12,"Python"); 
			System.out.println("after replacing"+ s);
	}
}

	


