/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dashboard;

/**
 *
 * @author Abdul Latip Muhyi
 */
public class penjualanHeader {
    
    private String namaBarang;

    private int noResi;
    private int kodeBarang;
//    private int stokMinimal;
//    private int typeBarang;
    private int kandunganNikotin;
//    private double hargaBeli;
    private double hargaJual;
    private String alamat;
    private int total;
    private int idPengguna;
    private String tanggal;
    
    
    public penjualanHeader(int noResi,int kodeBarang, String namaBarang,  
            int kandunganNikotin, double hargaJual, String alamat, int total, int idPengguna, String tanggal)
    {
        this.kodeBarang = noResi;
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.kandunganNikotin = kandunganNikotin;
//        this.kodeSatuan = kodeSatuan;
//        this.stokMinimal = stokMinimal;
        this.hargaJual = hargaJual;
        this.alamat = alamat;
        this.total = total;
        this.idPengguna = idPengguna;
        this.tanggal = tanggal;
    }
    
    public int getNoResi(){
        return noResi;
    }
    public int getKodeBarang(){
        return kodeBarang;
    }
    
    public String getNamaBarang(){
        return namaBarang;
    }
    
    public int getKandunganNikotin(){
        return kandunganNikotin;
    }
    
    public double getHargaJual(){
        return hargaJual;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public int getTotal(){
        return total;
    }
    
    public int getIdPengguna(){
        return idPengguna;
    }
    
    public String getTanggal(){
        return tanggal;
    }
    
}
