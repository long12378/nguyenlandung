package baitap5;
import java.util.Scanner;

public class tongvatich {
	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		n= scanner.nextInt();
		int tong=0;
		int tich=1;
		int x;
		while (n > 0) {
			x= n%10;
			n/=10;
			tong+= x;
			tich*= x;	
		}
		System.out.print("tong = " +tong);
		System.out.print("tich = " +tich);
	}
}