/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronAdapter2;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class AdaptadorImpresora implements Impresora{
    private ImpresoraAvanzada avanzada= new ImpresoraAvanzada();

    @Override
    public void imprimir(String texto) {
        avanzada.printAvanzada(texto);
    }
    
}
