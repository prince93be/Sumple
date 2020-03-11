import java.util.Scanner;

class Array1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];

		for(int i = 0;i < a.length;i++)
			a[i] = sc.nextInt();
		for(int i = 0;i < a.length;i++)
			System.out.printf("%-4d",a[i]*2);
	}
}