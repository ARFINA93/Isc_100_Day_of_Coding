package hari1;

import java.util.Scanner;

public class Hari4 {
    public static void main(String[] args) {
        
        //input data menggunakan scanner
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nama drakor : "); //System.out.print() artinya baris selanjutnya akan disambung dan tidak pindah ke baris baru
        String Drakor = input.nextLine(); //disinilah proses input dilakukan
        System.out.println("Drama korea (Drakor) favorit saya adalah " + Drakor);
    }
}
