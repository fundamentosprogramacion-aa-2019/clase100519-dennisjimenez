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
public class CicloCuatro {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int limite = 5;
        int contador = 1;
        int suma = 0;
        String mensajeFinal = "";
        
        //System.out.printf("%s","La suma de:\n");
        mensajeFinal = String.format("%s%s\n", mensajeFinal, "La suma de");
        while (contador <= limite){
            suma = suma + contador;
            //System.out.printf("%d\n", contador);
            mensajeFinal = String.format("%s%d\n", mensajeFinal, contador);
            contador = contador + 1;
        }
        mensajeFinal = String.format("%stiene un resultado de : %d\n",
                mensajeFinal, suma );
        System.out.printf("%s", mensajeFinal);
               
    }
}
