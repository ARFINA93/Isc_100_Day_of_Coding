package hari1;

import java.util.Scanner;

public class Hari11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Warung Ghaib");
        System.out.println("==============================");
        System.out.println("No Menu               Harga");
        System.out.println("1. Ayam Geprek        Rp.13000");
        System.out.println("2. Ayam goreng kecap  Rp.13000");
        System.out.println("3. Ayam Bakar         Rp.15000");
        System.out.println("4. Ayam palekko       Rp.15000");
        System.out.println("");
        
        int harga = 0;
        int hargamenu1 = 13000, hargamenu2 = 13000, hargamenu3 = 15000, hargamenu4 = 15000;
        String menu;
        System.out.println("==================================");
        System.out.print("Masukkan nomor pesanan : ");
        int pesanan = scanner.nextInt();
        System.out.println("==================================");
        if(pesanan == 1){
            menu = "Ayam Geprek";
            harga = harga + hargamenu1; 
            System.out.println("pesanan anda : " + menu);
    }
        else if(pesanan == 2){
            menu = "Ayam Goreng Kecap";
            harga = harga + hargamenu2;
            System.out.println("pesanan anda : "+ menu);
        }
        else if(pesanan == 3){
            menu = "Ayam Bakar";
            harga = harga + hargamenu3;
            System.out.println("pesanan anda : "+ menu);
        }
        else if(pesanan == 4){
            menu = "Ayam Palekko";
            harga = harga + hargamenu4;
            System.out.println("pesanan anda : "+ menu);
        }
        else{
            System.out.println("Nomor yang dipilih tidak ada dimenu");
        }
        System.out.println("Total harganya sebesar : " + " Rp." + harga);
        System.out.println("===========================================");
        System.out.println("Terima Kasih dan jangan lupa kembali lagi :)");
    }
}
