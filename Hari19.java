package hari1;

import java.util.Scanner;

public class Hari19 {
    public static void main(String[] args) { 
        //belajar percabangan utuk menentukan nilai ujian
        Scanner sc = new Scanner(System.in);
        
        //mendefenisikan 2 veriabel
        int nilai; //untuk menyimpan input nilai dari pengguna
        String hasil; //untuk menyimpan nilai yang akan dihitung
        System.out.println("Menghitung nilai ujian");
        System.out.print("Masukkan nilai : ");
        nilai = sc.nextInt();
        
        if(nilai >= 90){
            hasil= "A";
        }else if(nilai >= 80){
            hasil = "B";
        }else if(nilai >= 70){
            hasil = "C";
        }else if(nilai >= 50){
            hasil = "D";
        }else{
            hasil = "E";
        }
        System.out.println("Nilai ujian anda adalah : " + hasil);
    }
    
}
