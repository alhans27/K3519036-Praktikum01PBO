/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum01;

/**
 *
 * @author GGibran
 */
public class Praktikum01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Keramik A = new Keramik();
        A.luasLantai = 100;
        A.panjang = 30;
        A.lebar = 30;
        A.harga = 54000;
        A.pcs = 10;
        
        A.luasKeramik();
        A.butuhKeramik();
        A.biaya();
        
        Keramik B = new Keramik();
        B.luasLantai = 100;
        B.panjang = 40;
        B.lebar = 40;
        B.harga = 65000;
        B.pcs = 5;
        
        B.luasKeramik();
        B.butuhKeramik();
        B.biaya();
//        
        Keramik C = new Keramik();
        C.luasLantai = 100;
        C.panjang = 30;
        C.lebar = 40;
        C.harga = 60000;
        C.pcs = 8;
        
        C.luasKeramik();
        C.butuhKeramik();
        C.biaya();
    }
}
