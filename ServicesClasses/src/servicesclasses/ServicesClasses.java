package servicesclasses;

import servicesclasses.entities.Cafetera;
import servicesclasses.entities.CuentaBancaria;
import servicesclasses.entities.Person;
import servicesclasses.services.CafeteraServices;
import servicesclasses.services.CuentaBancariaServicios;
import servicesclasses.services.PersonService;

public class ServicesClasses {

    public static void main(String[] args) {

        /* ej 1
        CuentaBancariaServicios cbs = new CuentaBancariaServicios();
        CuentaBancaria c1 = cbs.createAccount();
        cbs.ingresar(c1, 50000);
        cbs.retirar(c1, 800);
        cbs.extraccionRapida(c1);
        cbs.consultarSaldo(c1);
        cbs.consultarDatos(c1);
         */
        
        /*        
        CafeteraServices cs = new CafeteraServices();
        Cafetera c = new Cafetera(1000);        
        cs.llenarCafetera(c);
        cs.servirTaza(c, "small");
        cs.agregarCafe(c, 250);
        cs.vaciarCafetera(c);
         */
        
        
        PersonService ps = new PersonService();

        Person p1 = ps.createPerson();
        Person p2 = ps.createPerson();
        Person p3 = ps.createPerson();
        Person p4 = ps.createPerson();

        System.out.println("peso ieal = 0 --- debajo del ideal = -1 --- sobre peso = 1 ");
        
        int imcP1 = ps.calcularIMC(p1);
        System.out.println(p1.getName() + " " + imcP1);
        
        int imcP2 = ps.calcularIMC(p2);
        System.out.println(p2.getName()+" "+ imcP2);
        
        int imcP3 = ps.calcularIMC(p3);
        System.out.println(p3.getName()+" "+ imcP3);
        
        int imcP4 = ps.calcularIMC(p4);
        System.out.println(p4.getName()+" "+ imcP4);
        
        
        System.out.println("Es mayor de edad?");
        
        boolean mayorP1 = ps.esMayor(p1);
        System.out.println(p1.getName() + " - " + mayorP1);
        
        boolean mayorP2 = ps.esMayor(p2);
        System.out.println(p2.getName() + " - " + mayorP2);
        
        boolean mayorP3 = ps.esMayor(p3);
        System.out.println(p3.getName() + " - " + mayorP3);
        
        boolean mayorP4 = ps.esMayor(p4);
        System.out.println(p4.getName() + " - " + mayorP4);
        
        
        
        int[] imcsPerson = { imcP1, imcP2, imcP3, imcP4 }; 
        boolean[] mayores = { mayorP1, mayorP2, mayorP3, mayorP4 };
        
        porcentajePeso(imcsPerson);
        porcentajeEdad(mayores);
        
    }
    
    
    public static void porcentajePeso( int[] gorditos ){
        
        double debajo = 0;
        double ideal = 0;
        double encima = 0;
        double total = gorditos.length;
        
        for (int i = 0; i < total; i++) {
            
            switch (gorditos[i]) {
                case 1:
                    encima += 1;
                    break;
                case -1:
                    debajo += 1;
                    break;
                default:
                    ideal += 1;
                    break;
            }

        }
        
        double totalFlacos =  (debajo /  total) * 100;  
        double totalIdeal = (ideal / total) * 100;
        double totalGordos = (encima / total) * 100;
        
        System.out.println("El "+totalFlacos+"% esta por debajo de su peso ideal");
        System.out.println("El "+totalGordos+"% esta por encima de su peso ideal");
        System.out.println("El "+totalIdeal+"% esta en su peso ideal");
        
    }
    
    public static void porcentajeEdad( boolean[] edades){
        
        double menores = 0;
        double mayores = 0;
        double total = edades.length;
        
        for (int i = 0; i < total; i++) {
            
            if( edades[i] ){
                mayores += 1;
            }else{
                menores += 1;
            }

        }
        
        double totalmayores =  (mayores /  total) * 100;  
        double totalMenores = (menores / total) * 100;
        
        System.out.println("El "+totalmayores+"% es mayor de edad");
        System.out.println("El "+totalMenores+"% es menor de edad");
        
        
    }
}








