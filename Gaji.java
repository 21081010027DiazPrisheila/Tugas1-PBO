/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gaji;

/**
 *
 * @author user
 */
public class Gaji {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama = "Diaz";
        String alamat = "Surabaya";
        String departemen = "IT";
        String pengalaman = "pemula";
        String skill = "web";
        int gaji;
        
        int gajiDasar = 0;
        switch (departemen) {
            case "IT":
                gajiDasar = 8000000;
                break;
            case "HRD":
                gajiDasar = 5000000;
                break;
            case "Finance":
                gajiDasar = 4000000;
                break;
            default:
                System.out.println("Departemen tidak valid");
                break;
        }
     
        int bonusPengalaman = 0;
        switch (pengalaman) {
            case "pemula":
                bonusPengalaman = 500000;
                break;
            case "menengah":
                bonusPengalaman = 1000000;
                break;
            case "expert":
                bonusPengalaman = 2000000;
                break;
            default:
                System.out.println("Pengalaman tidak valid");
                break;
        }
    
        int bonusSkill = 0;
        switch (skill) {
            case "web":
                bonusSkill = 1000000;
                break;
            case "mobile":
                bonusSkill = 2000000;
                break;
            case "desktop":
                bonusSkill = 2500000;
                break;
            default:
                System.out.println("Skill tidak valid");
                break;
        }
       
        System.out.println("Nama : "+nama);
        System.out.println("Alamat : "+alamat);
        System.out.println("Departemen (1.IT 2.HRD 3.Finance) : "+departemen);
        System.out.println("Pengalaman (1.pemula 2.menengah 3.expert) : "+pengalaman);
        System.out.println("Skill (1.web 2.mobile 3.desktop) : "+skill);
        gaji = gajiDasar+bonusPengalaman+bonusSkill;
        System.out.println("Total Pendapatan Anda : Rp "+gaji);
    }
    
}
