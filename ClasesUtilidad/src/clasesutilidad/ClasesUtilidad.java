package clasesutilidad;

import clasesutilidad.entities.Cadena;
import clasesutilidad.entities.ParDeNumeros;
import clasesutilidad.entities.Person;
import clasesutilidad.services.ArrayService;
import clasesutilidad.services.CadenaService;
import clasesutilidad.services.FechaService;
import clasesutilidad.services.ParDeNumerosService;
import clasesutilidad.services.PersonService;
import java.util.Date;

public class ClasesUtilidad {

    public static void main(String[] args) {

        double[] arrayA = new double[50];
        double[] arrayB = new double[20];

        // Cadena c1 = new Cadena("Hola Mundo");
        // CadenaService cs = new CadenaService();
        // cs.mostrarVocales(c1);
        // cs.invertirFrase(c1);
        // cs.vecesRepetida(c1);
        // cs.compararLong(c1);
        // cs.unirFrases(c1);
        // cs.reemplazar(c1);
        // boolean contieneLetra = cs.contiene(c1);
        // System.out.println(contieneLetra);
        
        // ParDeNumeros p = new ParDeNumeros();
        // ParDeNumerosService ps = new ParDeNumerosService();        
        // ps.mostrarValores(p);
        // ps.devolverMayor(p);
        // ps.calcularPow(p);
        // ps.calcularRaiz(p);
        
        /*
        ArrayService as = new ArrayService();
        as.inicializarA(arrayA);
        as.mostrar(arrayA);
        as.ordenar(arrayA);
        as.inicializarB(arrayA, arrayB);
        as.mostrar(arrayA);
        as.mostrar(arrayB);        
        */
        
        /*
        FechaService fs = new FechaService();
        Date fechaNacimiento = fs.fechaNac();
        Date fechaActual = fs.fechaActual();
        fs.edad(fechaNacimiento, fechaActual);
        */
        
        /*
        PersonService ps = new PersonService();
        Person p = ps.crearPersona();
        int edad = ps.calcularEdad(p);
        System.out.println( ps.menorQue(p, 18) );
        ps.mostrarPersona(p);        
        */
        
        
        



    }

}
