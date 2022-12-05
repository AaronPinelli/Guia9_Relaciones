
package guia9_relaciones3;

import Entidades.cartaEnt;
import Servicios.ServiceBaraja;
import java.util.ArrayList;
import java.util.Scanner;


public class Guia9_Relaciones3 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        ServiceBaraja L1 = new ServiceBaraja();
        ArrayList<cartaEnt> cartitas = L1.crearCarta();
         int opcion;
   
      do{
       System.out.println("-----------------------------------------------------");
       System.out.println("                        Menu");
       System.out.println("-----------------------------------------------------");
       System.out.println("1- Barajear");
       System.out.println("2- Siguiente carta");
       System.out.println("3- Cartas disponibles");
       System.out.println("4- Monton de cartas");
       System.out.println("5- Cartas Vistas");
       System.out.println("6- Mostrar Baraja");
       System.out.println("7- salir");
       System.out.println("------------");
       opcion= leer.nextInt();
       System.out.println("------------");
       if(opcion ==1){
           L1.barajar(cartitas);
       }else{
           if(opcion ==2){
               L1.siguienteCarta(cartitas);
           }else{
               if(opcion == 3){
                   L1.cartasDisponibles(cartitas);
               }else{
                   if(opcion == 4 ){
                   L1.darCartas(cartitas);
                   }else{
                       if(opcion == 5 ){
                           L1.cartasMonto(cartitas);
                       }else{
                           if(opcion == 6){
                               L1.motrarBaraja(cartitas);
                               }
                           }
                       }
                   }
               }
           }
       System.out.println("-----------------------------------------------------");
      }while(opcion != 7);
        
        
    }
    
}
