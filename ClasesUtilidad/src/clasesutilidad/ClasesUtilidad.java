package clasesutilidad;

import clasesutilidad.entities.Cadena;
import clasesutilidad.services.CadenaService;


public class ClasesUtilidad {

    public static void main(String[] args) {
        
        Cadena c1 = new Cadena("Hola Mundo");
        CadenaService cs = new CadenaService();
        
        // cs.mostrarVocales(c1);
        // cs.invertirFrase(c1);
        
    }
    
}
