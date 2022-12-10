/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package septiarakurnia21103010.uts_no3_a_3010;

/**
 *
 * @author admin
 */
public class AsistenPraktikum_3010 extends Mahasiswa_3010 implements IPendapatan_3010 {
    private String mkAsistensi_3010;
    private int jmlPertemuan_3010;
    double totalPendapatan_3010;
    
    public AsistenPraktikum_3010(String nim_3010,String nama_3010,String jurusan_3010,float ipk_3010,String mkAsistensi_3010,int jmlPertemuan_3010){
        super(nim_3010,nama_3010,jurusan_3010,ipk_3010);
        this.jmlPertemuan_3010 = jmlPertemuan_3010;
        this.mkAsistensi_3010 = mkAsistensi_3010;
    }
    public void setMkAsistensi_3010(String mkAsistensi_3010) {
        this.mkAsistensi_3010 = mkAsistensi_3010;
    }
    public String getMkAsistensi_3010() {
        return mkAsistensi_3010;
    }
    public void setJmlPertemuan_3010(int jmlPertemuan_3010) {
        this.jmlPertemuan_3010 = jmlPertemuan_3010;
    }
    public int getJmlPertemuan_3010() {
        return jmlPertemuan_3010;
    }
    public void tampilDataMhs_3010() {
        System.out.println("NIM                     : " + nim_3010);
        System.out.println("Nama                    : " + nama_3010);
        System.out.println("Jurusan                 : " + jurusan_3010);
        System.out.println("IPK                     : " + ipk_3010);
        System.out.println("MK Asistentsi           : " + mkAsistensi_3010);
        System.out.println("Jumlah Pertemuan        : " + jmlPertemuan_3010);
    }

    public double totalPendapatan_3010() {
        totalPendapatan_3010 = jmlPertemuan_3010 * 50000;
        return totalPendapatan_3010;
    }

    void setmkAsistensi_3010(String readLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
