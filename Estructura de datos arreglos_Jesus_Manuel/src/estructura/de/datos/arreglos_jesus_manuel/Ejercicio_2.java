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
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    
public static void main(String[] args) {
//Creamos una array con valor de 100
int[] numeros=new int[100];
//Declaro las variables de suma como entero
int suma=0;
//y la media como flotante para una cantidad decimal
double media;
//Busca y recorre el array, se asigna en números y lo suma los numeros.
for(int i=0;i<numeros.length;i++){
numeros[i]=i+1;
suma+=numeros[i];
}
//Se calcula la media y imprime la suma y la media con la concatenacion
System.out.println("La suma es "+suma);
media=(double)suma/numeros.length;
System.out.println("La media es "+media);
}
}

