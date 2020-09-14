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
public class Keramik {
    double luasLantai;
    int panjang;
    int lebar;
    int harga;
    int pcs;
    
    void luasKeramik(){
        int luasKeramik;
        luasKeramik = this.panjang * this.lebar;
        System.out.println("luas keramik: " + luasKeramik + " cm^2");
    }
    void butuhKeramik(){
        double butuhKeramik;
        butuhKeramik = this.luasLantai * 10000 / (this.panjang * this.lebar);
        System.out.println("Banyak keramik yang dibutuhkan: " + butuhKeramik + " buah");
    }
     
    void biaya(){
        double biaya;
        biaya = (((this.luasLantai * 10000) / (this.panjang * this.lebar)) * this.harga / this.pcs);
        System.out.println("Biaya yang dibutuhkan apabila memilih keramik tersebut adalah: +- " + biaya + " Rupiah");
    }
}
