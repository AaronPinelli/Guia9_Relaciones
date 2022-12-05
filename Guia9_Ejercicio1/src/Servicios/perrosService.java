
package Servicios;

import Entidades.*;
import java.util.*;


public class perrosService {
    Scanner leer = new Scanner(System.in).useDelimiter("n/");
    
    public ArrayList<perrosEnt>  CrearPerros(perrosEnt p1, perrosEnt p2){
    
        ArrayList<perrosEnt> perro = new ArrayList<>();
        
            System.out.println("Ingrese el nombre del perro  1");
            p1.setNombre(leer.next());
            System.out.println("Ingrese la raza del perro 1 ");
            p1.setRaza(leer.next());
            System.out.println("Ingrese la edad del perro 1");
            p1.setEdad(leer.nextInt());
            System.out.println("Ingrese el tamaño del perro 1 (Chiquito, mediano, grande)");
            p1.setTamaño(leer.next());
            perro.add(p1);
            
             System.out.println("Ingrese el nombre del perro  2");
            p2.setNombre(leer.next());
            System.out.println("Ingrese la raza del perro 2");
            p2.setRaza(leer.next());
            System.out.println("Ingrese la edad del perro 2");
            p2.setEdad(leer.nextInt());
            System.out.println("Ingrese el tamaño del perro 2 (Chiquito, mediano, grande)");
            p2.setTamaño(leer.next());
            perro.add(p2);
           
            return perro;
}
     public ArrayList<PerosnaEnt>  CrearPersonas(PerosnaEnt pers1, PerosnaEnt pers2){
    
        ArrayList<PerosnaEnt> persona = new ArrayList<>();
        
            System.out.println("Ingrese el nombre de la persona  1");
            pers1.setNombre(leer.next());
            System.out.println("Ingrese el apellido de la persona 1 ");
            pers1.setApellido(leer.next());
            System.out.println("Ingrese la edad de la persona 1");
            pers1.setEdad(leer.nextInt());
            System.out.println("Ingrese el dni de la persona 1 ");
            pers1.setDni(leer.nextInt());
            persona.add(pers1);
            
             System.out.println("Ingrese el nombre de la persona  2");
            pers2.setNombre(leer.next());
            System.out.println("Ingrese el apellido de la persona 2");
            pers2.setApellido(leer.next());
            System.out.println("Ingrese la edad de la persona 2");
            pers2.setEdad(leer.nextInt());
            System.out.println("Ingrese el dni de la persona 2 ");
            pers2.setDni(leer.nextInt());
            persona.add(pers2);
            
            return persona;
           
} 
    public void asignarPerros(ArrayList<perrosEnt> perritos, ArrayList<PerosnaEnt> personitas ){
        for (int i = 0; i < 2; i++) {
            personitas.get(i).setPerro(perritos.get(i));
        }
        
        
        
        
        
    }
     
     
     
    
}
