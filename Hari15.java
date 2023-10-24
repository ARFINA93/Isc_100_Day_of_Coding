package hari1;

import java.util.Scanner;

public class Hari15 {
    public static void main(String[] args) {
        //belajar operasi aritmatika menggunakan inputan
        Scanner input =new Scanner(System.in);
        System.out.println("Program menghitung luas persegi");
        System.out.print("masukkan panjang sisi persegi : ");
        
        if(input.hasNextDouble()){
            double sisi = input.nextDouble();
            double luas = sisi * sisi;
            System.out.println("luas persegi adalah : " +luas);
        }else {
            System.out.println("input tidak valid");
        }
    }
    
}
