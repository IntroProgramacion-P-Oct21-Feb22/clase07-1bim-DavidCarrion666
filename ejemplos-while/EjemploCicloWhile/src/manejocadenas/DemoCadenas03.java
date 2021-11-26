/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocadenas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class DemoCadenas03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        // Datos 
        String pais;
        String ciudad;
        String fechaIndependencia;
        String cadenaAcumuladora = "Datos Personales\n";

        //Entrada de datos
        System.out.println("Ingrese el país");
        pais = entrada.nextLine();

        System.out.println("Ingrese la ciudad");
        ciudad = entrada.nextLine();
        
        System.out.println("Ingrese la fecha de independencia");
        fechaIndependencia = entrada.nextLine();

        cadenaAcumuladora = String.format("%s%s\n", cadenaAcumuladora, pais);

        cadenaAcumuladora = String.format("%s%s\n", cadenaAcumuladora, ciudad);

        cadenaAcumuladora = String.format("%s%s\n", cadenaAcumuladora,
                fechaIndependencia);

        System.out.printf("%s", cadenaAcumuladora);

    }
}
