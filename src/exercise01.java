import java.util.Scanner;

public class exercise01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số tự nhiên: ");
        int n = scanner.nextInt();

        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("Số " + n + " chia hết cho cả 3 và 5.");
        } else {
            System.out.println("Số " + n + " không chia hết cho cả 3 và 5.");
        }
        scanner.close();
    }
}
