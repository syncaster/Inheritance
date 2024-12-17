/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MultipleInheritance;

/**
 *
 * @author SaifulNB
 */
public class MainKendaraan {
    
    public static void main(String[] args) {
        Amfibi amfibi = new Amfibi();
        amfibi.start("Panser APC Anoa 6x6 Amphibious");
        amfibi.bergerakDiDarat();
        amfibi.bergerakDiAir();
        amfibi.stop();
    }
}
