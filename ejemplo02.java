package string02;
import java.util.*;

/**
 *
 * @author hidal
 */
public class String02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FINAL int maximo= 50;
        
         System.out.println("Escribe un masimo de 50 caracteres");
        String caracteres = new Scanner(System.in).nextLine();
        
        String caracteresP = caracteres.replaceAll("\\s","");
        
        if (caracteresP.length()< maximo){ 
            System.out.println(caracteresP);

        }else{
           System.out.println("Error has puesto mas de 50 caracteres");
        }
        
    }
    
}
