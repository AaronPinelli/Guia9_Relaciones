
package Servicios;

import Entidades.*;
import java.util.*;


public class ServiceBaraja {
    
    barajaEnt J = new barajaEnt();
    ArrayList<cartaEnt> cartitasVistas = new ArrayList(); 
    
    
   public ArrayList<cartaEnt> crearCarta(){
    ArrayList<cartaEnt> cartitas = new ArrayList();
   
       J.setContador(0);
         for (int i = 1; i < 11; i++) {
              cartaEnt laCarta = new cartaEnt();
            if(i != 9 && i != 8){
            
            laCarta.setNumero(i);
            laCarta.setPalo("Copas");
            }else{
                if(i == 9){
                    laCarta.setNumero(12);
            laCarta.setPalo("Copas");
                }else{
                    if(i == 8){
                       laCarta.setNumero(11);
            laCarta.setPalo("Copas");
                    }
                } 
            }
            cartitas.add(laCarta);
        }
          for (int i = 1; i < 11; i++) {
           cartaEnt laCarta = new cartaEnt();
            if(i != 9 && i != 8){
            
            laCarta.setNumero(i);
            laCarta.setPalo("Oro");
            }else{
                if(i == 9){
                    laCarta.setNumero(12);
            laCarta.setPalo("Oro");
                }else{
                    if(i == 8){
                       laCarta.setNumero(11);
            laCarta.setPalo("Oro");
                    }
                } 
            }
            cartitas.add(laCarta);
        }
           for (int i = 1; i < 11; i++) {
             cartaEnt laCarta = new cartaEnt();
               if(i != 9 && i != 8){
            
            laCarta.setNumero(i);
            laCarta.setPalo("Basto");
            }else{
                if(i == 9){
                    laCarta.setNumero(12);
            laCarta.setPalo("Basto");
                }else{
                    if(i == 8){
                       laCarta.setNumero(11);
            laCarta.setPalo("Basto");
                    }
                } 
            }
            cartitas.add(laCarta);
        }
            for (int i = 1; i < 11; i++) {
             cartaEnt laCarta = new cartaEnt();           
                if(i != 9 && i != 8){
            
            laCarta.setNumero(i);
            laCarta.setPalo("Espadas");
             cartitas.add(laCarta);
            }else{
                if(i == 9){
                    laCarta.setNumero(12);
            laCarta.setPalo("Espadas");
             cartitas.add(laCarta);
                }else{
                    if(i == 8){
                       laCarta.setNumero(11);
            laCarta.setPalo("Espadas");
             cartitas.add(laCarta);
                    }
                } 
            }
           
        }
   
    return cartitas;
}
   public void barajar(ArrayList<cartaEnt> cartitas){
        System.out.println("_______________________________________________________");
        System.out.println("                Las cartas se barajaron                ");
        System.out.println("-------------------------------------------------------");
        Collections.shuffle(  cartitas);
        System.out.println("_______________________________________________________");
    }
   public void siguienteCarta(ArrayList<cartaEnt> cartitas){
        System.out.println("_______________________________________________________");
        System.out.println("              La siguiente carta es :                  ");
        System.out.println("-------------------------------------------------------");
        
        if( cartitas.isEmpty()){
            System.out.println("Ya no quedan cartas dentro de la baraja.");
        }else{
            System.out.println(cartitas.get(J.getContador()));
            cartitasVistas.add(cartitas.get(J.getContador()));
            cartitas.remove(J.getContador());
            J.setContador(J.getContador() + 1);
           
        }
        System.out.println("_______________________________________________________");
   }
   public void cartasDisponibles(ArrayList<cartaEnt> cartitas){
       System.out.println("_______________________________________________________");
       System.out.println("          cantidad de cartas disponibles               ");
       System.out.println("-------------------------------------------------------");
       System.out.println("La cantidad es : " + cartitas.size());
       System.out.println("_______________________________________________________");

   }
   public void darCartas(ArrayList<cartaEnt> cartitas){
       Scanner leer = new Scanner(System.in);
        int cartasPedidas;
       System.out.println("_______________________________________________________");
       System.out.println("                 Pedir por mayor                       ");
       System.out.println("-------------------------------------------------------");
       System.out.println("Cuantas cartas desea retirar?");
        cartasPedidas = leer.nextInt();
       if((J.getContador() + cartasPedidas) <= 40){
       for (int i = J.getContador(); i < (J.getContador() + cartasPedidas); i++) {
            
                System.out.println(cartitas.get(i));
                cartitasVistas.add(cartitas.get(i));
                cartitas.remove(i);
                
       }
       J.setContador(J.getContador() + cartasPedidas);
       }else{
           System.out.println("el numero ingresado es superior al de cartas disponibles");
       }
       
       System.out.println("_______________________________________________________");
   }
   public void cartasMonto(ArrayList<cartaEnt> cartitas){
       System.out.println("_______________________________________________________");
       System.out.println("                  Cartas Vistas                        ");
       System.out.println("-------------------------------------------------------");
       for (cartaEnt aux : cartitasVistas) {
           System.out.println(aux);
           
       }
       System.out.println("_______________________________________________________");
   }
   public void motrarBaraja(ArrayList<cartaEnt> cartitas){
       System.out.println("_______________________________________________________");
       System.out.println("               Cartas en la Baraja                     ");
       System.out.println("-------------------------------------------------------");
       for (cartaEnt aux : cartitas) {
           System.out.println(aux);
       }
       System.out.println("_______________________________________________________");
   }
   

   }

