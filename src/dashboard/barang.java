/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dashboard;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abdul Latip Muhyi
 */
public class barang {

    static void setModel(DefaultTableModel jTLaporanMasuk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String namaBarang;

    private int kodeBarang;
//    private int kodeSatuan;
//    private int stokMinimal;
    private int typeBarang;
    private int kandunganNikotin;
    private double hargaBeli;
    private double hargaJual;
    private int stok;
    private String suplier;
    private String tanggal;

    public barang(int kodeBarang, String namaBarang, int typeBarang, 
            int kandunganNikotin, double hargaBeli, double hargaJual, int stok, String suplier, String tanggal)
    {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.typeBarang = typeBarang;
        this.kandunganNikotin = kandunganNikotin;
//        this.kodeSatuan = kodeSatuan;
//        this.stokMinimal = stokMinimal;
        this.hargaBeli = hargaBeli;
        this.hargaJual = hargaJual;
        this.stok = stok;
        this.suplier = suplier;
        this.tanggal = tanggal;
    }
    
    public int getKodeBarang(){
        return kodeBarang;
    }
    
    public String getNamaBarang(){
        return namaBarang;
    }
    
    public int getTypeBarang(){
        return typeBarang;
    }
    
    public int getKandunganNikotin(){
        return kandunganNikotin;
    }
    
    public double getHargaBeli(){
        return hargaBeli;
    }
    
    public double getHargaJual(){
        return hargaJual;
    }
    
    public int getStok(){
        return stok;
    }
    
    public String getSuplier(){
        return suplier;
    }
    
    public String getTanggal(){
        return tanggal;
    }
}
