package baitap12;

import java.util.Scanner;
public class Fibonaci {
	private static Scanner sc;

	public static void main(String[] args) {

		System.out.println("In n chu so fibonacci dau tien nhap tu ban phim: \n");
		sc = new Scanner(System.in);
		System.out.print("Nhap n = ");
		int n = sc.nextInt();
		System.out.println("\n"+ n + " chu so fibonacci dau tien la: ");
		for (int i = 0; i < n; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}

	public static int fibonacci(int n) {
		int f0 = 0;
		int f1 = 1;
		int fn = 1;

		if (n < 0) {
			return -1;
		} else if (n == 0 || n == 1) {
			return n;
		} else {
			for (int i = 2; i < n; i++) {
				f0 = f1;
				f1 = fn;
				fn = f0 + f1;
			}
		}
		return fn;
	}

}
