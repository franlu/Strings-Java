import java.util.*;

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 * @author Fran Lucena <fran.lucena@gmail.com>
 */
public class Ejemplo02 {

    public static void main(String[] args) {
         
        final int MAXIMO= 50;
        
        System.out.println("Escribe un texto con un máximo de 50 caracteres");
        
        String cadena = new Scanner(System.in).nextLine();
        
        // Limpiar separadores
        String caracteres = cadena.replaceAll("\\s+","");
        
        if (caracteresP.length() < MAXIMO){ 
            
            System.out.println("Enhorabuena, no has superado el límite de caracteres.");
            
        }else{
            
           System.out.println("Has escrito más de 50 caracteres.");
            
        }
        
    }
    
}
