package clasesutilidad.services;

import java.util.Date;
import java.util.Scanner;

public class FechaService {

    public Date fechaNac() {

        int dia, mes, anio;
        Scanner read = new Scanner(System.in);

        System.out.println("Dia de naciminto?");
        dia = read.nextInt();
        System.out.println("Mes de naciminto?");
        mes = read.nextInt();
        System.out.println("Año de naciminto?");
        anio = read.nextInt();

        return new Date(anio, mes -1, dia);

    }

    public Date fechaActual() {
        return new Date();
    }

    public void edad(Date fechaNac, Date fechaAct) {

        Date fechaNacimiento = fechaNac;
        Date fechaActual = fechaAct;

        long diferenciaEnMilisegundos = fechaActual.getTime() - fechaNacimiento.getTime();
        long diferenciaEnDias = diferenciaEnMilisegundos / (24 * 60 * 60 * 1000);
        int edadEnAnos = (int) (diferenciaEnDias / 365);

        System.out.println("La edad del usuario es " + edadEnAnos + " años.");
    }

}
