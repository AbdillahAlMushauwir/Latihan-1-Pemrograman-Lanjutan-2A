/* Nama  : Abdillah Al Mushauwir
 * NIM   : 11200930000001
 * Kelas : 2A Sistem Informasi
 * Tugas mata kuliah pemrograman lanjut
 */
package TugasOverloading;

public class Matematika {
    //pertambahan
    void pertambahan (int a, int b){
	System.out.println("hasil dari " +  a + " + " +  b + " = " + (a+b));
    }
    void pertambahan(int a, int b, int c){
        System.out.println("hasil dari " +  a + " + " +  b + " + " +  c + " = "+ (a+b+c));
    }
    void pertambahan (double a, double b){
	System.out.println("hasil dari " +  a + " + " + b  + " = "+ (a+b));
    }
 
    void pertambahan (double a, double b, double c){
	System.out.println("hasil dari " + a + " + " + b + " + " + c + " = "+ (a+b+c));
    }
    
//pengurangan
    void pengurangan (int a, int b){
	System.out.println("hasil dari " + a + " - " + b + " = "+ (a-b));
    }
     void pengurangan (int a, int b, int c){
	System.out.println("hasil dari " + a + " - " + b + " - " + c + " = "+ (a-b-c));
    }
    void pengurangan (double a, double b){
	System.out.println("hasil dari " + a + " - " + b + " = "+ (a-b));
    }
    void pengurangan (double a, double b, double c){
	System.out.println("hasil dari " + a + " - " + b + " - " + c + " = "+ (a-b-c));
    }
    
 //Perkalian
    void perkalian (int a, int b){
	System.out.println("hasil dari " + a + " * " + b + " = "+ (a*b));
    }
    void perkalian (int a, int b, int c){
	System.out.println("hasil dari " + a + " * " + b + " * " + c + " = "+ (a*b*c));
    }
     void perkalian (double a, double b){
	System.out.println("hasil dari " + a + " * " + b + " = "+ (a*b));
    }
    void perkalian (double a, double b, double c){
	System.out.println("hasil dari " + a + " * " + b + " * " + c + " = "+ (a*b*c));
    }
    
//pembagian
    void pembagian (int a, int b){
	System.out.println("hasil dari " + a + " / " + b + " = "+ (a/b));
    }
    void pembagian (int a, int b, int c){
	System.out.println("hasil dari " + a + " / " + b + " / " + c + " = "+ (a/b/c));
    }
    void pembagian (double a, double b){
	System.out.println("hasil dari " + a + " / " + b + " = "+ (a/b));
    }
    void pembagian (double a, double b, double c){
	System.out.println("hasil dari " + a + " / " + b + " / " + c + " = "+ (a/b/c));
    }
}
