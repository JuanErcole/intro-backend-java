package clasesutilidad.services;

import clasesutilidad.entities.ParDeNumeros;

public class ParDeNumerosService {

    public void mostrarValores(ParDeNumeros p) {
        double n1 = p.getNum1();
        double n2 = p.getNum2();

        System.out.println("Numero 1 = " + n1);
        System.out.println("Numero 2 = " + n2);
    }

    public void devolverMayor(ParDeNumeros p) {
        double n1 = p.getNum1();
        double n2 = p.getNum2();

        double numMax = Math.max(n1, n2);

        System.out.println("el numero mayor es: " + numMax);
    }

    public void calcularPow(ParDeNumeros p) {
        long n1 = Math.round(p.getNum1()) ;
        long n2 = Math.round(p.getNum2());
        System.out.println(n1);
        System.out.println(n2);
        
        long nMayor = Math.max(n1, n2);
        long nMenor = Math.min(n1, n2);
        
        double potencia = Math.pow(nMayor, nMenor);
        
        System.out.println("el resultado de la potencia es: "+potencia);
    }
    
    public void calcularRaiz(ParDeNumeros p) {
        double n1 = p.getNum1();
        double n2 = p.getNum2();
        
        double nMenor = Math.min(n1, n2);
        double nAbs = Math.abs(nMenor);
        
        double raiz = Math.sqrt(nAbs);
        
        System.out.println("el resultado de la raiz es: "+raiz);
    }
    
    
    
    

}
