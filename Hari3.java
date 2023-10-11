package hari1;

public class Hari3 {
    public static void main(String[] args) {
        
         //konversi string ke tipe data primitif
        //konversi string ke integer
        String nilai1 = "10";
        int bilBulat = Integer.parseInt(nilai1);
        System.out.println("Konversi String Ke Tipe Data Primitif :");
        System.out.println("Hasil konversi string ke integer : " + bilBulat);
        
        //konversi string ke double
        String nilai2 = "243.251";
        double bilDesimal = Double.parseDouble(nilai2);
        System.out.println("Hasil konversi string ke double : " + bilDesimal);
        
        //konversi string ke float
        String nilai3 = "1.47";
        float bilPecahan = Float.parseFloat(nilai3);
        System.out.println("Hasil Konversi string ke float : " + bilPecahan);
        System.out.println("---------------------------------------");
        
        //konversi tipe data primitif ke string
        // konversi integer ke string
        int angka1 = 13;
        String bilangan_bulat = Integer.toString(angka1);
        
        //konversi double ke string
        double angka2 = 2.4325;
        String bilangan_pecahan = Double.toString(angka2);
        
        //konversi float ke string
        float angka3 = 2.25f;
        String bilangan_desimal = Float.toString(angka3);
        
        System.out.println("Konversi Tipe Data Primitif Ke String :");
        System.out.println("Hasil konversi integer ke string :" + bilangan_bulat);
        System.out.println("Hasil konversi double ke string :" + bilangan_pecahan);
        System.out.println("Hasil konversi float ke string :" + bilangan_desimal);
        
    }
    
}
