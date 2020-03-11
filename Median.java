
import java.util.Scanner;

class Median{ //method median
	static int median(int a,int b,int c){
		int med;
		if(a >= b){
			if(b >= c)
				med = b;
			else if(c >= a)	
				med = a;
			else
				med = c;
		}
		else if(a > c)
			med = a;
		else if(b > c)
			med = c;
		else
			med = b;
		return med;
	}
	
    public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
  		System.out.println("x=");//input 3 number
		int x = stdIn.nextInt();
		System.out.println("y=");
		int y = stdIn.nextInt();
		System.out.println("z=");
		int z = stdIn.nextInt();

		int med = median(x,y,z);//call median method
		System.out.println("median = "+ med); //print median
    }
}
