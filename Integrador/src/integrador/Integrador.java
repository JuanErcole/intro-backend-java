package integrador;

import integrador.entities.Estudiante;
import java.util.ArrayList;
import java.util.Arrays;

public class Integrador {

    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("Juan", 8);
        Estudiante e2 = new Estudiante("Rocio", 9);
        Estudiante e3 = new Estudiante("Beatriz", 3);
        Estudiante e4 = new Estudiante("Marta", 4);
        Estudiante e5 = new Estudiante("Roberto", 1);
        Estudiante e6 = new Estudiante("Mariano", 4);
        Estudiante e7 = new Estudiante("Luciano", 6);
        Estudiante e8 = new Estudiante("Nena", 10);

        Estudiante students[] = new Estudiante[]{e1, e2, e3, e4, e5, e6, e7, e8};

        mostrarPromedios(students);
        String stDes[] = alumnosDestacados(students);
        System.out.println(Arrays.toString(stDes));
    }

    private static void mostrarPromedios(Estudiante[] students) {
        double promedio = 0;
        double total = 0;
        for (int i = 0; i < students.length; i++) {
            double notaEst = students[i].getNota();
            total += notaEst;
        }
        promedio = total / students.length;
        System.out.println(promedio);
    }

    private static String[] alumnosDestacados(Estudiante[] students) {
        double promedio = 0;
        double total = 0;
        
        ArrayList<String> destacados = new ArrayList<String>();

        
        for (int i = 0; i < students.length; i++) {
            double notaEst = students[i].getNota();
            total += notaEst;
        }

        promedio = total / students.length;

        for (int i = 0; i < students.length; i++) {
            double notaEst = students[i].getNota();
            
            if (notaEst > promedio) {
                
                destacados.add(students[i].getNombre());
            }
        }
        
        String[] estudiantes = destacados.toArray(new String[destacados.size()] );
        
        return estudiantes;

    }

}
