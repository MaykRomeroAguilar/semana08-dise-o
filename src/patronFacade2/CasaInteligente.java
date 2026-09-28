/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronFacade2;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class CasaInteligente {
    private Luces luces = new Luces();
    private Alarma alarma = new Alarma();
    private Calefaccion calefaccion = new Calefaccion();  
    
    void modoSeguridad(){
        luces.encender();
        alarma.activar();
        calefaccion.regular();
    }
    
}
