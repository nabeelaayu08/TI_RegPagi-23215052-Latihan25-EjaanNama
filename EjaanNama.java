package EjaanNama;
/**
 *NAMA : NABE'ELA AYU NING TYAS ZAHRA
 * PRODI : TEKNIK INFORMATIKA
 * NIM       : 23215052
 * Deskripsi Program : Program ini akan mengeja nama  yang dimasukkan oleh pengguna, huruf per huruf, dengan urutan yang sesuai.
 */

import java.util.Scanner;

public class EjaanNama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input nama dari pengguna
        System.out.print("Masukkan nama depan anda untuk di eja: ");
        String nama = input.nextLine();

        // Menampilkan ejaan per huruf
        System.out.println("Ejaan untuk \"" + nama + "\" adalah :");
        for (int i = 0; i < nama.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + " : " + nama.charAt(i));
        }
        input.close();
    }
}
