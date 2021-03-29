/* Nama  : Abdillah Al Mushauwir
 * NIM   : 11200930000001
 * Kelas : 2A Sistem Informasi
 * Tugas mata kuliah pemrograman lanjut
 */
package TugasInheritance;

public class MatematikaCanggihBeraksi {
    public static void main (String[] args){
        MatematikaCanggih math = new MatematikaCanggih();
        
        math.setpertambahan(9,9);
        System.out.println("Hasil dari 9 + 9 adalah : " +math.gettambah());
        math.setperkalian(9,9);
        System.out.println("Hasil dari 9 * 9 adalah : " +math.getkali());
        math.setmodulus(9,9);
        System.out.println("Hasil modulus : " +math.getmodulus());
    }
}
