package program.test;

public class Overload {
	 int Ove (int a, int b)
	 {
	return a+b;
	 }
float Ove (int r)
{

			return 3.14F*r*r;
}

			int Ove (int len,long bre) {
				return 0;
			}

			public static void main(String[] args) { 
				 Overload s1 = new Overload (); 
				 int d1 = s1.Ove (4, 3); 
				 float d2 = s1.Ove (9);

				 int d3 = s1.Ove (5, 8);

				 System.out.println (d1);
				 System.out.println (d2); 
				 System.out.println (d3);
			}
	}

