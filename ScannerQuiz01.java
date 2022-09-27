import java.util.Scanner;

//input 3 20000 Siomay
public class ScannerQuiz01{
    public static void main(String[]args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Program Koperasi");
            System.out.println("Masukkan Pembelian Koin : ");
            int koin = scanner.nextInt();
            System.out.print("Masukkan Jumlah Uang: ");
            String jumlahUang = scanner. nextLine();
            System.out.print("Masukkan Barang Dibeli : ");
            String barangDibeli = scanner. nextLine();
            System.out.println("Jumlah Koin :"+ koin);
            System.out.println("Uang Bayar : "+ jumlahUang);
            System.out.println("Barang Dibeli : "+ barangDibeli);
        }
    }
}