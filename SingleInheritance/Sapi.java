/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SingleInheritance;

/**
 *
 * @author SaifulNB
 */
public class Sapi extends Mamalia {
    
    String jenis;

    public Sapi(String jenis, String nama, int umur) {
        super(nama, umur);
        this.jenis = jenis;
    }

    @Override
    public void suara() {
        System.out.println("Suaranya moooo");
    }

    void memamahbiak() {
        System.out.println("Sapi makan rumput");
    }
    
}
