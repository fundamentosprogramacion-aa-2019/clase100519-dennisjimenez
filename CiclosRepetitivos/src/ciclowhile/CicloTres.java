/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclowhile;

/**
 *
 * @author reroes
 */
public class CicloTres {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int limite = 5;
        int contador = 1;
        int suma = 0;
        System.out.printf("%s","La suma de:\n");
        while (contador <= limite){
            suma = suma + contador;
            System.out.printf("%d\n", contador);
            contador = contador + 1;
        }
        System.out.printf("Tiene un resultado de: %d\n", suma);
               
    }
}
