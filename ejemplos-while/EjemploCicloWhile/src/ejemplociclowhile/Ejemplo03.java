/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int limite = 5;
        int contador = 1;
        int suma = 0;
        int valor_ingresado;
        
        while (contador <= limite) {
            System.out.println("ingrese el valor a sumar"); // 2-2-2-2
            valor_ingresado= entrada.nextInt();  
            suma = suma + valor_ingresado;  // 0+2=2 2+2=4 2+4=6 6+2=8
            System.out.printf("Contador %d\n", valor_ingresado); 
            contador = contador + 1;  // 0+1=1 1+1=2 2+1=3 3+1=4
        }

        System.out.printf("La suma final es %d\n", suma);

    }
}
