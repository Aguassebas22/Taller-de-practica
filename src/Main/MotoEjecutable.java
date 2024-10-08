
package Main;

import Motos.Color;
import Motos.Moto;
import Motos.TipoMoto;


public class MotoEjecutable {


    public static void main(String[] args) {
        Moto moto = new Moto(" Xtz " , 2014 , 550 , 6 , 250 );
        
        System.out.println("Marca = " + moto.getMarca());
        System.out.println("Modelo = " + moto.getModelo());
        System.out.println("Motor = " + moto.getMotor());
        System.out.println("Años = " + moto.getAños());
        System.out.println("Cilindraje = " + moto.getCilindraje());
        System.out.println("Color = " + Color.Negro);
        System.out.println("Tipo de moto = " + TipoMoto.Todoterreno);
        
        
        
            
   }

}