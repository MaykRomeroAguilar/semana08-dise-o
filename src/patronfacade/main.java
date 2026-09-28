/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronfacade;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class main {
 
    public static void main(String[] args) {
       HomerFacade home= new HomerFacade(new Televisor(),new Parlantes(), new DVD());
       home.verPelicula();
       home.salirDelCine();
    }
    
}
