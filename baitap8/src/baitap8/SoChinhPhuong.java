package baitap8;
import java.util.Scanner;
class SoChinhPhuong {
    static boolean checkPerfectSquare(double x)
    {
        double sq = Math.sqrt(x);
        return ((sq - Math.floor(sq)) == 0);
    }
    public static void main(String[] args)
    {
        System.out.print("Nhap vao so can kiem tra:");
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        scanner.close();
        if (checkPerfectSquare(num))
            System.out.println(num+ " La so chinh phuong");
        else
            System.out.println(num+ " Khong phai la so chinh phuong");
    }
}
