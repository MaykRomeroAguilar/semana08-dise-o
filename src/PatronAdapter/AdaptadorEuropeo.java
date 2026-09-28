/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronAdapter;

 
public class AdaptadorEuropeo implements Enchufe{
    private EnchufeEuropeo enchufeEuropeo;
    public AdaptadorEuropeo(EnchufeEuropeo enchufeEuropeo){
        this.enchufeEuropeo = enchufeEuropeo;
    }
    
    @Override
    public void conectar(){
        enchufeEuropeo.conectarEuropeo();
    }
    
}
