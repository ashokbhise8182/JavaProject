package StackP;
import java.util.Stack;
public class stack {
		public static void main(String[] args){
		
			Stack<String> s1=new Stack<>();
			s1.add("russia");
			s1.add("frnace");
			s1.add("italy");
			s1.add("brezil");
			s1.add("india");
			s1.add("kenya");
			s1.add("canada");
			s1.add("korea");
			s1.add("derman");
			s1.add("brezil");
			s1.pop();
			s1.pop();
			s1.pop();
			s1.add("banaan");
			s1.add("mango");
			s1.add("grapes");
			s1.add("apple");
			s1.add("pinaple");
			s1.add("kivi");
			
			System.out.println(s1);
			s1.peek();
			s1.pop();
			s1.pop();
			s1.pop();
			s1.pop();
			System.out.println(s1);
			System.out.println("finding india:"+s1.search("india"));
			System.out.println("finding india:"+s1.search("canda"));

			
			

		}

	}

