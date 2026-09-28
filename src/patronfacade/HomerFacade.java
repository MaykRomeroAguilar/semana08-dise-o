/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronfacade;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class HomerFacade {
    
    private Televisor tv;
    private Parlantes parlantes;
    private DVD dvd;
    
    public HomerFacade(Televisor tv, Parlantes parlantes, DVD dvd) {
    this.tv = tv;
    this.parlantes = parlantes;
    this.dvd = dvd;
    }
    
    public void verPelicula() {
    tv.encender();
    parlantes.subirVolumen();
    dvd.reproducir();
    }
    public void salirDelCine() {
    dvd.reproducir();
    tv.apagar();
}
    
    
}
