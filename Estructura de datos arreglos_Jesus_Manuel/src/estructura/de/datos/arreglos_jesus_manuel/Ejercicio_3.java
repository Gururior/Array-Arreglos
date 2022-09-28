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

import java.util.Scanner;

public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

Scanner sn=new Scanner(System.in);

//Pido una longitud
System.out.println("Inserte una longitud");
int longitud=sn.nextInt();

//Se crea el array con esa longitud
int numeros[]=new int[longitud];
//Se declara una variable en entero
int num;

//Recorro el array
for(int i=0;i<numeros.length;i++){
//se imprime un mensaje para poner el valor especifico
System.out.println("Inserte un número en la posicion "+i);

//Vamos utilizar el ciclo do y el while
do{
//Pide el numero en una posicion especifica
num=sn.nextInt();
//Si pusiste un numero mal imprime un mensaje
if(!(num>=0 && num<=10)){
System.out.println("Error. Solo números del 0 al 10. "
+ "Inserte un número en la posicion "+i);
}

}while(!(num>=0 && num<=10));

//Y si se asigna, ya que sé que el número es correcto
numeros[i]=num;

}

//Esta parte es opcional para que se vea lo que hemos insertado
System.out.println("Estos son los números elegidos por el usuario");
for(int i=0;i<numeros.length;i++){
System.out.println(numeros[i]);
}

}

}

