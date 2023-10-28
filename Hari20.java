package hari1;

import java.util.Scanner;

public class Hari20 {
    public static void main(String[] args) {
        //Belajar operasi aritmatika(perkalian dan pembagian)
        Scanner scan = new Scanner(System.in);
        //mendeklarasikan variabel untuk menyimpan alas dan tinggi segitiga
        int a, t;
        double luas;
        //membaca input dari pengguna
        System.out.println("Menghitung Luas Segitiga");
        System.out.print("masukkan alas : ");
        a = scan.nextInt();
        System.out.print("masukkan tinggi : ");
        t = scan.nextInt();
        //menghitung luas segitiga
        luas = 0.5*a*t;
        System.out.println("luas segitiga : " + luas);
    }
    
}
