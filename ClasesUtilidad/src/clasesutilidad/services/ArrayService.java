package clasesutilidad.services;

import java.util.Arrays;

public class ArrayService {

    public void inicializarA(double[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 10;
        }

    }

    public void mostrar(double[] array) {
        System.out.println(Arrays.toString(array));
    }

    public void ordenar(double[] arreglo) {

        Arrays.sort(arreglo);

        int longitud = arreglo.length;

        for (int i = 0; i < longitud / 2; i++) {
            double temp = arreglo[i];
            arreglo[i] = arreglo[longitud - 1 - i];
            arreglo[longitud - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(arreglo));
    }
    
    public void inicializarB(double[] arrayA, double[] arrayB) {

        int largo = arrayB.length;
        
        System.arraycopy(arrayA, 0, arrayB, 0, 9);
        
        Arrays.fill(arrayB, 10, largo -1, 0.5);
    }

}
