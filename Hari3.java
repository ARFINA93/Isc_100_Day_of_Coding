package hari1;

public class Hari3 {
    public static void main(String[] args) {

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
    }
    
}
