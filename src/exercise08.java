import java.util.Scanner;
public class exercise08 {
    public static boolean isTriangle(int a, int b, int c) {
        return a+b>c && a+c>b && b+c>a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        while(true){
            System.out.print("Nhập cạnh a: ");
            a = sc.nextInt();
            System.out.print("Nhập cạnh b: ");
            b = sc.nextInt();
            System.out.print("Nhập cạnh c: ");
            c = sc.nextInt();

            if(isTriangle(a,b,c)){
                break;
            }else{
                System.out.println("Độ dài 3 cạnh a,b,c không hợp lệ để tạo thành một tam giác. Vui lòng nhập lại.");
            }
        }
        double perimeter = a+b+c;
        double semiPerimeter = perimeter/2;
        double area= Math.sqrt(semiPerimeter*(semiPerimeter-a)*(semiPerimeter-b)*(semiPerimeter-c));
        System.out.printf("Chu vi của tam giác là: %.3f%n", perimeter);
        System.out.printf("Diện tích của tam giác là: %.3f%n", area);
        sc.close();
    }
}
