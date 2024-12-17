/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MultipleInheritance;

/**
 *
 * @author SaifulNB
 */
public class Amfibi extends Kendaraan implements Darat, Air{
    
    @Override
    public void start(String nama) {
        System.out.println(nama +" dinyalakan");
    }

    @Override
    public void stop() {
        System.out.println("Kendaraan dimatikan");
    }
    
    
    @Override
    public void bergerakDiDarat() {
        System.out.println("Kendaraan bergerak di jalan");
    }

    @Override
    public void bergerakDiAir() {
        System.out.println("Kendaraan bergerak di air");
    }
    
}
