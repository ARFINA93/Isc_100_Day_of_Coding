package hari1;

import java.util.Scanner;

public class Hari10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("== Menghitung gaji karyawan ==");
        
        String nama;
        char golongan;
        int bonus_pertahun = 100000, gaji_karyawan, total_gaji;
        int lama_bekerja;
        
        System.out.print("Nama karyawan : ");
        nama = scanner.nextLine();
        
        System.out.print("Golongan : ");
        golongan = (char) scanner.nextInt();
         
        System.out.print("Lama kerja karyawan : ");
        lama_bekerja = scanner.nextInt();
        System.out.println();
        
        //menentukan jumlah gaji dan bonus pertahun
        switch(golongan){
            case 1:
                gaji_karyawan = 4000000;
                break;
            case 2 :
                gaji_karyawan = 7000000;
                break;
            case 3 :
                gaji_karyawan = 10000000;
                break;
        }
        //mengitung jika karyawan telah bekerja selama 5 tahun
        total_gaji = bonus_pertahun * lama_bekerja;
        if ((bonus_pertahun) > 5){
            total_gaji = total_gaji + ((bonus_pertahun)*100000);
        }

        //output
        System.out.println(nama + " Telah bekerja selama " + lama_bekerja + " tahun dan menerima gaji sebesar Rp." + total_gaji);
    }
    
}
