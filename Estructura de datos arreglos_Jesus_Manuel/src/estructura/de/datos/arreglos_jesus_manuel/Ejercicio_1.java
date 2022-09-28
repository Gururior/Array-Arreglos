/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.de.datos.arreglos_jesus_manuel;

/**
 *
 * @author helte
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Creo el la variable array con un entero con las cifra de 100
int[] numeros=new int[100];
//lo llama la condicion con la variable y ponemos length para la cantidad de elementos que puede contener una array.
for(int i=0;i<numeros.length;i++){
//Lo recorro y le asigna números del 1 al 100 automatico.
  numeros[i]=i+1;
//lo imprime los resultados
System.out.println(numeros[i]);
}
}
}
