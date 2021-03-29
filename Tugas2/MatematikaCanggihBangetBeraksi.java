/* Nama  : Abdillah Al Mushauwir
 * NIM   : 11200930000001
 * Kelas : 2A Sistem Informasi
 * Tugas mata kuliah pemrograman lanjut
 */
package Tugas2;

public class MatematikaCanggihBangetBeraksi {
    public static void main (String [] args){
        MatematikaCanggihBanget math = new MatematikaCanggihBanget();
        
        math.setpertambahanTiga(9,9,9);        
                System.out.println("Hasil dari 9 + 9 + 9 adalah : " +math.getpertambahanTiga());
        math.setpertambahan(9,9);
                System.out.println("Hasil dari 9 + 9 adalah : " +math.getpertambahan());
        math.setperkalian(9,9);
                System.out.println("Hasil dari 9 * 9 adalah : " +math.getperkalian());
        math.setmodulus(9,2);
                System.out.println("Hasil modulus adalah : " +math.getmodulus());
                
    }
}
