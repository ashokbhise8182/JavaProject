package Tcollection;
import java.util.HashSet;
import java.util.TreeSet;
public class SetExample {

	public static void main(String[] args) {
				HashSet<String> h=new HashSet<String>();
				h.add("surendra");
				h.add("mani");
				h.add("supriya");
				h.add("subbu");
				
				h.remove("supriya");
				TreeSet<String> t=new TreeSet<String>();
				t.add("python");
				t.add("java");
				t.add("c-lang");
				t.add("js");
				t.add("c++");
				t.add("sap");
				
				System.out.println("before operations :"+t);
				t.remove("sap");
				t.remove("js");
				System.out.println("after rmoval of two :"+t);
				t.add("bootstrap");
				t.add("html");
				t.add("dot net");
				System.out.println("after the adding three:"+t);
				System.out.println("checking java is part or not?"+t.contains("java"));
				t.removeAll(t);
				System.out.println("after last operation:"+t);
				
			}

		}
