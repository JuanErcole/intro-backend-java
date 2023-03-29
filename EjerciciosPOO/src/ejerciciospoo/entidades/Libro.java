package ejerciciospoo.entidades;

import java.util.Scanner;

public class Libro {

    public int ISBN;
    public String titulo;
    public int numeroPaginas;
    public String autor;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, int numeroPaginas, String autor) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", numeroPaginas=" + numeroPaginas + ", autor=" + autor + '}';
    }
    

    public void cargaLibro() {

        Scanner leer = new Scanner(System.in);


        System.out.println("Ingrese el titulo del libro");
        titulo = leer.nextLine();

        System.out.println("Ingrese el autor del libro");
        autor = leer.nextLine();

        System.out.println("Ingrese el ISBN del libro");
        ISBN = leer.nextInt();

        System.out.println("Ingrese la cantidad de paginas del libro");
        numeroPaginas = leer.nextInt();

    }
    
    public void mostrarLibro(){
        System.out.println(toString());
    }
    

}
