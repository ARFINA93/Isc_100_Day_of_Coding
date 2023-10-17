package hari1;

import java.util.Scanner;

public class Hari9 {
    public static void main(String[] args) {
        
        //Switch case
        //menghitung luas dan keliling persegi panjang
        Scanner input = new Scanner (System.in);
        int panjang , lebar ;
        double luas , keliling;
        int pilih;
        System.out.println("== Menghitung luas dan keliling persegi panjang ==");
        System.out.print("Masukkan panjang : ");
        panjang = input.nextInt();
        System.out.print("Masukkan lebar : ");
        lebar = input.nextInt();
        System.out.println("pilihan :");
        System.out.println("1. Luas \n2. Keliling");
        System.out.print("Masukkan pilihan : ");
        pilih = input.nextInt();
                
        switch (pilih){
            case 1:
                luas = panjang * lebar;
                System.out.println("Luas persegi panjang adalah : " + luas);
                break;
            case 2:
                keliling = (2*panjang)+(2*lebar);
                System.out.println("Keliling persegi panjang adalah: " + keliling);
                break;
        }
    }
}
