/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dashboard;

/**
 *
 * @author Abdul Latip Muhyi
 */
public class typeBarang {
    
    private int idType;
    private String typeBarang;
    private String keterangan;
    
    public typeBarang(int idType, String typeBarang, String keterangan)
    {
        this.idType = idType;
        this.typeBarang = typeBarang;
        this.keterangan = keterangan;
    }
    
    public int getIdType(){
        return idType;
    }
    
    public String getTypeBarang(){
        return typeBarang;
    }
    
    public String getKeterangan(){
        return keterangan;
    }
    
}
