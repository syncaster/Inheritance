/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SingleInheritance;

/**
 *
 * @author SaifulNB
 */
public class Kucing extends Mamalia {
    
    String warnaBulu;

    public Kucing(String warnaBulu, String nama, int umur) {
        super(nama, umur);
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void suara() {
        System.out.println("Suaranya meong");
    }

    void makan() {
        System.out.println("Kucing makan daging");
    }
   
}
