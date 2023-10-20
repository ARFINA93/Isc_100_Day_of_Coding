package hari1;

public class Hari12 {
    public static void main(String[] args) {
        //contoh perulangan for untuk mecetak angka
        System.out.println("Perulangan for");
        for(int i = 1; i <= 30; i += 4){
            System.out.print(i + " ");
        }
        // contoh perulangan for each(digunakan untuk menampilkan isi dari array)
        System.out.println(" ");
        System.out.println("Perulangan for each ");
        int angka[] = {1,3,5,7,9};
        for(int i : angka){
            System.out.print(i + " ");
        }
        //contoh perulangan while
        System.out.println(" ");
        System.out.println("Perulangan while");
        int i = 1; 
        while (i <= 5){
            System.out.println("Angka ke- " + i);
            i++;
        }
        System.out.println(" ");
        System.out.println("Perulangan do while");
        int j = 1;
        do{
            System.out.println("Angka ke- " + j);
            j++;
        }while(j <= 20);
    }
}
