/* Nama  : Abdillah Al Mushauwir
 * NIM   : 11200930000001
 * Kelas : 2A Sistem Informasi
 * Tugas mata kuliah pemrograman lanjut
 */
package TugasOverloading;

public class MatematikaCanggih extends Matematika{
    
    //modulus   
    void modulus (int a, int b){
	System.out.println("hasil dari " + a + " % " + b + " = " + (a%b));
    }
    void modulus (int a, int b, int c){
	System.out.println("hasil dari " + a + " % " + b + " % " + c+ " = " + (a%b%c));
    }
    void modulus (double a, double b){
	System.out.println("hasil dari " + a + " % " + b + " = " + (a%b));
    }
    void modulus (double a, double b, double c){
	System.out.println("hasil dari " + a + " % " + b + " % " + c+ " = " + (a%b%c));
    }
}
