import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı seçiniz : ");
        int A = scanner.nextInt();
        // 2-3-5-7 Sayıları Asal olarak gözükmüyor Düzelt
        if (A == 2 ){
            System.out.println(A + " asal bir sayı...");
        }else if (A == 3){
            System.out.println(A + " asal bir sayı...");
        }else if (A == 5){
            System.out.println(A + " asal bir sayı...");
        }else if (A == 7){
            System.out.println(A + " asal bir sayı...");
        }else if (A % 2 < 1){
            System.out.println("Asal değil...");
        } else if (A % 3 < 1) {
            System.out.println("Asal değil...");
        }else if (A % 5 < 1) {
            System.out.println("Asal değil...");
        }else if (A % 7 < 1) {
            System.out.println("Asal değil...");
        }else if (A % 8 < 1) {
            System.out.println("Asal değil...");
        }else if (A % 9 < 1) {
            System.out.println("Asal değil...");
        }else {
            System.out.println(A + " asal bir sayı...");
        }
    }
}