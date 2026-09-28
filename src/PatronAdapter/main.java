/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PatronAdapter;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class main {

     
    public static void main(String[] args) {
        EnchufeEuropeo europeo= new EnchufeEuropeo();
        Enchufe adaptador = new AdaptadorEuropeo(europeo);
        
        adaptador.conectar();
    }
    
}
