/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaFinal = "";
        double nota;
        boolean bandera = true;
        String salida;
        double suma = 0;
        double promedio;
        int contador = 0;
        do{
            System.out.println("Ingrese calificaciones");
            nota = entrada.nextDouble();
            cadenaFinal = String.format("%s%.2f\n", cadenaFinal, nota);
            entrada.nextLine(); // limpieza de buffer
            
            System.out.println("Ingrese (s) si desea salir del ciclo ");
            salida = entrada.nextLine();
            
            suma = suma + nota;
            contador = contador + 1;            
            
            if (salida.equals("s")) {
                bandera = false;
            }
            promedio = suma/contador;
            
        }while(bandera); // (bandera==true)
        System.out.printf("Listado de Notas\n%s%s%.2f\n", cadenaFinal,"Y el promedio es: ",promedio);
    }
}
