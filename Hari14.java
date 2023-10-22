package hari1;

import java.util.Scanner;

public class Hari14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nomor pilihan anda : ");
        
        int memilih = scanner.nextInt();
        
        switch (memilih){
            case 1:
                System.out.println("Kamu memilih saya");
                break;
            case 2:
                System.out.println("kamu memilih mantanmu");
                break;
            default:
                System.out.println("pilihan anda tidak valid silahkan memilih angka yang sesuai");
        }
    }
 
}
