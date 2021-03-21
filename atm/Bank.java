/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author LENOVO
 */
public class Bank {
    int saldo;
    int pertambahan;
    int pengurangan;
    
    public void saldoAwal(){
        this.saldo=100000;
        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("Saldo saat ini  :" + saldo);
    }
    
    public void simpanUang(int pertambahan){
        saldo=saldo+pertambahan;
        System.out.println("Simpan Uang     :"+ pertambahan);
        System.out.println("Saldo saat ini  :" + saldo);
    }
    
    public void ambilUang(int pengurangan){
        saldo=saldo-pengurangan;
        System.out.println("Ambil Uang      :"+ pengurangan);
        System.out.println("Saldo saat ini  :" + saldo);
    }
    
    int getSaldo(){
        return saldo;
    }
}
