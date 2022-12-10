/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package septiarakurnia21103010.uts_no3_a_3010;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class UTS_NO3_A_3010 {

    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
            AsistenPraktikum_3010 A = new AsistenPraktikum_3010(null,null,null,0,null,0);
            StudentStaff_3010 S = new StudentStaff_3010(null,null,null,0,0,0);
            
            ArrayList<Integer> jumlah=new ArrayList<Integer>();
            System.out.print("Jumlah Asisten Praktikum    : ");
            int input = Integer.parseInt(br.readLine());
            while (input>0){ 
                jumlah.add(Integer.parseInt(br.readLine()));
                System.out.print("NIM                     : " ); 
                A.nim_3010 = br.readLine();
                System.out.println("Nama                    : " );
                A.nama_3010 = br.readLine();
                System.out.println("Jurusan                 : " );
                A.jurusan_3010 = br.readLine();
                System.out.println("IPK                     : " );
                A.ipk_3010 = Float.parseFloat(br.readLine());
                System.out.println("MK Asistentsi           : " );
                A.setmkAsistensi_3010(br.readLine());
                System.out.println("Jumlah Pertemuan        : " );
                A.setJmlPertemuan_3010(Integer.parseInt(br.readLine()));
                System.out.println("");
            }
                A.tampilDataMhs_3010();
        }
        catch(IOException ex){
            System.out.println(); 
        }
    }
}
    
