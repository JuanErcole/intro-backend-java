package clasesutilidad.services;

import clasesutilidad.entities.Curso;
import java.util.Scanner;

public class CursoService {

    public String[] cargarAlumnos() {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de alumnos, recuerde que no puede ser mayor a 5");
        int cantAlumn = read.nextInt();
        read.nextLine();        
        
        String[] alumnos = new String[cantAlumn];

        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("alumno "+(i+1));
            alumnos[i] = read.nextLine();
        }
        
        return alumnos;

    }
    
    public Curso crearCurso(){
        
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el nombre del curso");
        String nombre = read.nextLine();
        
        System.out.println("Ingrese la cantidad de hrs por dia");
        int hsDia = read.nextInt();
        read.nextLine();
        
        System.out.println("Ingrese la cantidad de hrs por semana");
        int hsSemana = read.nextInt();
        read.nextLine();

        
        System.out.println("Ingrese el turno (Mañana/Tarde)");
        String turno = read.nextLine();

        
        System.out.println("Ingrese el precio por hr");
        float precioHr = read.nextFloat();
        read.nextLine();
        
        System.out.println("Ingrese el nombre de los alumnos");
        String[] alumnos = cargarAlumnos();
        
        return new Curso(nombre, hsDia, hsSemana, turno, precioHr, alumnos);
        
    }
    
    public void calcularGanancia(Curso c){
        float precio = c.getPrecioHora();
        int hrsSemanales = c.getCantidadHsSemana();
        int cantidadAlumnos = c.getAlumnos().length;
        
        float ganancia = (precio*hrsSemanales) * cantidadAlumnos;
        
        System.out.println("La ganancia semanal del curso es de : $"+ganancia);
    }
    
}