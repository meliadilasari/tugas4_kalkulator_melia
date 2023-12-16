import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input angka pertama: ");
        int a = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Input operator aritmatika ( + - / x ): ");
        String c = input2.next();


        Scanner input3 = new Scanner(System.in);
        System.out.println("Input angka kedua: ");
        int b = input3.nextInt();
        int hasil = 0;

        switch (c) {
            case ("+"):
                hasil = a + b;
                break;
            case ("-"):
                hasil = a - b;
                break;
            case ("x"):
                hasil = a * b;
                break;
            case ("/"):
                hasil = a / b;
                break;

            default:
                System.out.println("angka atau operator yang Anda input invalid, silahkan coba kembali.");
                break;

        }
         System.out.println("hasil perhitungan: " + hasil);

    }
}
