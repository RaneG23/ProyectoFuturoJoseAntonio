/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package futuro;

/**
 *
 * @author Pepe
 */
public class Futuro {
   /* Este código ha sido hecho por Jose Antonio Bonmatí Garrido inspirado
      en el código proporcionado en el curso de DAM*/
    
    static private String veredicto(String v1, String v2){
        if (v1.equals(v2)) {
            return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
        }
        if (Integer.valueOf(v1) > Integer.valueOf(v2)){
            return "Poco tiempo de estudio. Debes dedicar más tiempo.";
        }
        return "Ideal. Trabajas los contenidos en casa.";
    }
    
    public static void main(String[] args) {
        System.out.println("Estudiante " + args[0] + " : " + veredicto(args[1],args[2]));
    }
    
}
