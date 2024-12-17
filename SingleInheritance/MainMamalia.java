/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SingleInheritance;

/**
 *
 * @author SaifulNB
 */
public class MainMamalia {
    
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Oren", "Momoi", 2);
        Sapi sapi = new Sapi("Brahma", "Milo", 5);
                
        kucing.makan();
        kucing.suara();
       
        sapi.memamahbiak();
        sapi.suara();        
    }
}
