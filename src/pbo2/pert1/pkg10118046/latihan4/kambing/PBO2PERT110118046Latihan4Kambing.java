/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pert1.pkg10118046.latihan4.kambing;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program : membuat fungsi tambahKambing yang akan menambah jumlahKambing
 */
public class PBO2PERT110118046Latihan4Kambing {

    /**
     * @param args the command line arguments
     */
    
    public void tambahKambing() {
        int jumlahKambing = 0;
    
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing Setelah Ditamabah: " + jumlahKambing);
}
    
    public static void main(String[] args) {
        // TODO code application logic here
        PBO2PERT110118046Latihan4Kambing kambingJantan = new PBO2PERT110118046Latihan4Kambing();
        kambingJantan.tambahKambing();
    }

}
