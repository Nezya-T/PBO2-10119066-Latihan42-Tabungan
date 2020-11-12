/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10119066.latihan42.tabungan;
import java.util.Scanner;

/**
 *
 * @author Neyza-T
 * Nama  : Nezya Tariska
 * Kelas : IF2
 * Nim   : 10119066
 */
public class PBO210119066Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====Program Penarikan Uang=====");
        System.out.print("Masukkan Saldo Awal \t\t: ");
        Tabungan tabungan = new Tabungan(System.in);
        System.out.print("Jumlah uang yang akan diambil \t: ");
        System.out.println("Saldo anda sekarang \t\t: " + tabungan.ambilUang(scanner.nextInt()));
        
        
    }
    
}
