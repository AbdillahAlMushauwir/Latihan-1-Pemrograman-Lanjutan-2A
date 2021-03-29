/* Nama  : Abdillah Al Mushauwir
 * NIM   : 11200930000001
 * Kelas : 2A Sistem Informasi
 * Tugas mata kuliah pemrograman lanjut
 */
package TugasInheritance;

public class MatematikaCanggih extends Matematika {
    private int pertambahan;
        void setpertambahan(int a, int b)
        {pertambahan = a+b;}
        int gettambah(){
            return pertambahan;}
        
    private int perkalian;
        void setperkalian(int a, int b)
        {perkalian = a*b;}
        int getkali(){
            return perkalian;}
        
}
