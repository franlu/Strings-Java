import java.util.Scanner;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 * @author Fran Lucena <fran.lucena@gmail.com>
 */
public class Ejemplo01 {

   public static void main(String[] args) {
        
      System.out.println("Introduce una frase con espacios en blanco al inicio");
            
      String cadena = new Scanner(System.in).nextLine();
         
      // Eliminar espacios en blanco al inicio y al final
      String cad_aux = cadena.trim();
        
      int posicion = cadena.indexOf(cad_aux);
      String resultado = cadena.substring(posicion);
       
      System.out.println("La frase sin espacios inciales es: " + resultado);
    } 
}
