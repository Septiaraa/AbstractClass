/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package septiarakurnia21103010.uts_no3_a_3010;

/**
 *
 * @author admin
 */
public class StudentStaff_3010 extends Mahasiswa_3010 implements IPendapatan_3010 {
    private int unitKerja_3010;
    private int jamKerja_3010;
    double totalPendapatan_3010;
    
    public StudentStaff_3010(String nim_3010,String nama_3010,String jurusan_3010,float ipk_3010, int unitKerja_3010, int jmKerja_3010 ){
        super(nim_3010, nama_3010, jurusan_3010,ipk_3010);
        this.unitKerja_3010 = unitKerja_3010;
        this.jamKerja_3010 = jamKerja_3010;
    }
    public int getUnitKerja_3010() {
        return unitKerja_3010;
    }
    public void setUnitKerja_3010(int unitKerja_3010) {
        this.unitKerja_3010 = unitKerja_3010;
    }
    public int getJamKerja_3010() {
        return jamKerja_3010;
    }
    public void setJamKerja_3010(int jamKerja_3010) {
        this.jamKerja_3010 = jamKerja_3010;
    }
    public void tampilDataMhs_3010() {
        System.out.println("NIM                     : "+ nim_3010);
        System.out.println("Nama                    : "+ nama_3010);
        System.out.println("Jurusan                 : "+ jurusan_3010);
        System.out.println("IPK                     : "+ ipk_3010);
        System.out.println("Unit Kerja              : "+ unitKerja_3010);
        System.out.println("Jam Kerja               : "+ jamKerja_3010);
        System.out.println("Total Pendapatan        : "+ totalPendapatan_3010());
    }
    public double totalPendapatan_3010() {
        totalPendapatan_3010 = jamKerja_3010 * 30000;
        return totalPendapatan_3010;
    }
    
}
