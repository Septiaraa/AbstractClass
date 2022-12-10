/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package septiarakurnia21103010.uts_no3_a_3010;

/**
 *
 * @author admin
 */
public abstract class Mahasiswa_3010 {
    protected String nim_3010;
    protected String nama_3010;
    protected String jurusan_3010;
    protected float ipk_3010;
    
    public Mahasiswa_3010(String nim_3010,String nama_3010,String jurusan_3010,float ipk_3010){
        this.ipk_3010 = ipk_3010;
        this.jurusan_3010 = jurusan_3010;
        this.nama_3010 = nama_3010;
        this.nim_3010 = nim_3010;
    }
    public abstract void tampilDataMhs_3010();
}
