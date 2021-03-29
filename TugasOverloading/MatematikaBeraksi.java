/* Nama  : Abdillah Al Mushauwir
 * NIM   : 11200930000001
 * Kelas : 2A Sistem Informasi
 * Tugas mata kuliah pemrograman lanjut
 */
package TugasOverloading;

public class MatematikaBeraksi {
    public static void main (String [] args){
        MatematikaCanggih math = new MatematikaCanggih();
        
        math.pertambahan(12.5, 28.7, 14.2);
        math.pertambahan(12, 28, 14);
        math.pertambahan(23, 34);
        math.pertambahan(3.4, 4.9);
       
        math.pengurangan(8.5, 1.2, 1.2);
        math.pengurangan(10, 2, 1);
        math.pengurangan(24, 12);
        math.pengurangan(6.4, 3.2);
        
        math.perkalian(8.5, 1.2, 1.2);
        math.perkalian(10, 2, 1);
        math.perkalian(24, 12);
        math.perkalian(6.4, 3.2);
        
        math.pembagian(8.5, 1.2, 1.2);
        math.pembagian(10, 2, 1);
        math.pembagian(24, 12);
        math.pembagian(6.4, 3.2);
    }
}
