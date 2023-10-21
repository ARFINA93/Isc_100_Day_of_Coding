package hari1;

import java.util.Scanner;

public class Hari13 {
    public static void main(String[] args) {
        //soal Round
        //program yang dapat menerima input angka dengan ketentuan jika dijumlahkan kedua nilai genap  maka ditambah 1 dan jika kedua nilai ganjil maka ditambah 2
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan nilai1 : ");
        int nilai1 = scan.nextInt();
        
        System.out.print("Masukkan nilai2 : ");s
        int nilai2 = scan.nextInt();
        int total = nilai1 + nilai2;
        
        //menggunakan operasi ternary
        total = (total % 2  == 0) ? total + 1: total + 2;
        System.out.println("Hasil penjumlahannya adalah : " + total);
    }
}
    
