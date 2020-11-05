package baitap13;

import java.util.Scanner;
public class kiemtrasoK {

	private static Scanner sc;

	public static void main(String[] args) {

		int d = 0;
		int index = 0;

		sc = new Scanner(System.in);
		System.out.print("Nhap k = ");
		int k = sc.nextInt();

		if (k == 0 || k == 1) {
			if (k == 0) {
				System.out.println(k + " la so fibonacci vi tri thu dau tien trong day");
			} else {
				System.out.println(k + " la so fibonacci vi tri thu 2 va 3 trong day");
			}
			return;
		}
		for (int i = 0; i <= k; i++)
			if (k == fb(i)) {
				d++;
				index = i;
			}
		if (d == 1) {
			System.out.println(k + " la so fibonacci vi tri thu " + (index + 2) + " trong day");
		} else {
			System.out.println(k + " khong phai la so fibonacci trong day");
		}
	}

	public static int fb(int n) {
		if (n == 0 || n == 1 || n == 2 || n == 3)
			return n;
		return fb(n - 2) + fb(n - 1);
	}

}
