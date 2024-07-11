    import java.util.Scanner;

    public class exercise07 {
        public static void checkEvenOdd(int number) {
            if (number % 2 == 0) {
                System.out.println(number + " là số chẵn.");
            } else {
                System.out.println(number + " là số lẻ.");
            }
        }
        public static boolean isPrime(int number) {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
        public static void checkDivisibleBy3(int number) {
            if (number % 3 == 0) {
                System.out.println(number + " chia hết cho 3.");
            } else {
                System.out.println(number + " không chia hết cho 3.");
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int choice;
            int number;

            do {
                System.out.println("Menu:");
                System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số");
                System.out.println("2. Kiểm tra số nguyên tố");
                System.out.println("3. Kiểm tra một số có chia hết cho 3 không");
                System.out.println("4. Thoát");
                System.out.print("Chọn chức năng (1-4): ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Nhập số cần kiểm tra: ");
                        number = scanner.nextInt();
                        checkEvenOdd(number);
                        break;
                    case 2:
                        System.out.print("Nhập số cần kiểm tra: ");
                        number = scanner.nextInt();
                        if (isPrime(number)) {
                            System.out.println(number + " là số nguyên tố.");
                        } else {
                            System.out.println(number + " không là số nguyên tố.");
                        }
                        break;
                    case 3:
                        System.out.print("Nhập số cần kiểm tra: ");
                        number = scanner.nextInt();
                        checkDivisibleBy3(number);
                        break;
                    case 4:
                        System.out.println("Thoát chương trình.");
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                        break;
                }

            } while (choice != 4);

            scanner.close();
        }
    }

