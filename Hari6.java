package hari1;

public class Hari6 {
    public static void main(String[] args) {
        
        int angka1 = 50;
        int angka2 = 2;
        boolean a = true;
        boolean b = false;
        
        //operator aritmetika
        int penjumlahan = angka1 + angka2;
        int pengurangan = angka1 - angka2;
        int perkalian = angka1 * angka2;
        int pembagian= angka1 / angka2;
        int sisa_bagi = angka1 % angka2;
        
        System.out.println("Hasil penjumlahan : " +penjumlahan);
        System.out.println("Hasil pengurangan : " +pengurangan);
        System.out.println("Hasil perkalian : " +perkalian);
        System.out.println("Hasil pembagian : " +pembagian);
        System.out.println("Hasil sisa_bagi : " +sisa_bagi);
        System.out.println("---------------------------------------");
        
        //operator perbandingan
        System.out.println("angka1 lebih besar dari angka2 : " + (angka1 > angka2));
        System.out.println("angka1 kurang dari atau sama dengan angka2 : " + (angka1 <= angka2));
        System.out.println("angka1 sama dengan angka2 : " + (angka1 == angka2));
        System.out.println("angka1 tidak sama dengan angka2 : " + (angka1 != angka2));
        System.out.println("---------------------------------------");
        
        //operator logika
        System.out.println("a AND b : " + (a && b));
        System.out.println("a OR b : " + (a || b));
        System.out.println("NOT b : " + (!b));
        
    }
    
}
