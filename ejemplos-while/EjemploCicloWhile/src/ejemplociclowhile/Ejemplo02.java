/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;

/**
 *
 * @author reroes
 */
public class Ejemplo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int limite = 20;
        int contador = 1;

        while (contador <= limite) {
            System.out.printf("Contador %d\n", contador);
            contador = contador + 1;

        }

    }
}
