import java.util.Scanner;  
public class Program4 {
	 public static void main(String[] args)
	    {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter the first number : ");
	        int x = in.nextInt();  
			System.out.print("Enter the second number: ");
			int y = in.nextInt(); 
			System.out.print("Enter the third number : ");
	        int z = in.nextInt(); 
	        System.out.print("The result is: "+sumoftwo(x, y, z));
			System.out.print("\n");
	    }
	    
	    public static boolean sumoftwo(int p, int q, int r)
	      {	
	         return ((p + q) == r || (q + r) == p || (r + p) == q);	
		   }
}
