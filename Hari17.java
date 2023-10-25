package hari1;

import java.util.Scanner;

public class Hari17 {
    public static void main(String[] args) {
        
        //Belajar operator aritmatika(penjumlahan)
        int angka1, angka2, hasil;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama: ");
        angka1 = scan.nextInt();
        
        System.out.print("Masukkan angka kedua: ");
        angka2 = scan.nextInt();
        
        hasil = angka1 + angka2;
        System.out.println("Hasil penjumlahan dari angka1 dan angka2 adalah: " + hasil);
    }
    
}
