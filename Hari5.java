package hari1;

import java.util.Scanner;

public class Hari5 {
    public static void main(String[] args) {
        
        //operasi aritmetika menggunakan input
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka1 : ");
        int angka1 = input.nextInt();
        
        System.out.print("masukkan angka2 : ");
        int angka2 = input.nextInt();
        
        int penjumlahan = angka1 + angka2;
        int pengurangan = angka1 - angka2;
        int perkalian = angka1 * angka2;
        int pembagian = angka1 / angka2;
        
        System.out.println("Hasil penjumlahan angka1 dan 2 adalah : " + penjumlahan);
        System.out.println("Hasil pengurangan angka1 dan 2 adalah : " + pengurangan);
        System.out.println("Hasil perkalian angka1 dan 2 adalah : " + perkalian);
        System.out.println("Hasil pembagian angka1 dan 2 adalah : " + pembagian);
    }
    
}
