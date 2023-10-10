package hari2;

public class Hari2 {

    public static void main(String[] args) {
     
        //tipe data primitif adalah tipe data dasar yang sudah ada di dalam bahasa pemrograman contoh sederhananya yaitu seperti angka dan karakter
        //tipe data non-primitif adalah wadah yang lebih besar yang dapat digunakan untuk menggabungkan atau mengatur data yang lebih kompleks atau terstruktur seperti teks atau kumpulan nilai
        
        // Tipe data primitif
        int umur = 20; //int yang digunakan untuk menyimpan nilai umur dalam bentuk bilangan bulat
        double tinggi_badan = 160.0; //double yang digunakan untuk menyimpan tinggi badan dalam bentuk bilangan pecahan
        char kelas = 'G'; // char yang digunakan untuk menyimpan karakter tunggal yang mewakili kelas
        boolean mahasiswa = true; //boolean yang digunakan sebagai nilai benar (true) atau salah (false)

        // Menampilkan informasi tipe data primitif
        System.out.println("Tipe Data Primitif:");
        System.out.println("Umur : " + umur);
        System.out.println("Tinggi Badan : " + tinggi_badan);
        System.out.println("Kelas : " + kelas);
        System.out.println("Mahasiswa : " + mahasiswa);
        System.out.println("------------------------------");

        // Tipe data non-primitif (String)
        String[] nama_mahasiswa = {"fina", "laelia", "nike", "fitta"}; // Tipe data non-primitif 'String[]' (array) untuk menyimpan nama

        // Tipe data non-primitif (int[])
        int[] nilaiFisika = {85, 92, 78, 88}; // Tipe data non-primitif 'int[]' (array) untuk menyimpan nilai fisika

        // Menampilkan informasi
        System.out.println("Daftar Nama Mahasiswa:");
        for (int i = 0; i < nama_mahasiswa.length; i++) { //'int i = 0' adalah di mana kita menginisialisasi variabel i dengan nilai 0, 'i < nama_mahasiswa.length' adalah kondisi yang harus terpenuhi agar loop terus berjalan. Loop akan terus berjalan selama nilai 'i' lebih kecil dari panjang array 'nama_mahasiswa', 'i++' Ini bertujuan untuk meningkatkan nilai 'i' sebesar 1 setiap kali loop dijalankan sehingga kita dapat melacak iterasi berikutnya
            System.out.println((i + 1) + ". " + nama_mahasiswa[i]); //'(i + 1)' digunakan untuk menampilkan nomor urut yang dimulai dari 1 (daripada 0, yang merupakan indeks dalam array), 'nama_mahasiswa[i]' adalah elemen dalam array 'nama_mahasiswa' yang saat ini diindeks oleh nilai 'i'
        }

        System.out.println("Nilai Fisika:");
        for (int i = 0; i < nilaiFisika.length; i++) {
            System.out.println("Nilai " + (i + 1) + ": " + nilaiFisika[i]);
        }

        // Menghitung rata-rata nilai fisika
        double totalNilaiFisika = 0;
        for (int i = 0; i < nilaiFisika.length; i++) {
            totalNilaiFisika += nilaiFisika[i];
        }
        double rataRataFisika = totalNilaiFisika / nilaiFisika.length;

        System.out.println("Rata-rata Nilai Fisika: " + rataRataFisika);
    }
}


        
     
