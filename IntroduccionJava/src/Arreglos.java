import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        // Declaramos el arreglo
        int[] numerosEnteros;
        //Inicializamos el arrego
        numerosEnteros = new int[5];

        //Declarar e inicializar arreglo en una linea
        int[] edades = new int[3];

        //Declara un arreglo con var. Se debe de inicializar en la misma linea
        var turnos = new int[2];

        //Modificacion de valores de los arreglos:
        edades[0] = 1;
        edades[1] = 20;
        edades[2] = 28;

        System.out.println(edades[0]);

        //Sintaxis simplificada para declarar y definir valores de un arreglo:
        int[] edadAmigos = {20, 34, 54, 23, 45};
        var edadParientes = new int[]{34, 56, 34, 23};
        System.out.println(edadAmigos[4]);
        System.out.println(edadParientes[0]);

        //Ejercicio para imprimir elementos de un arreglo de forma iterativa con
        //el ciclo for:
        //1-. Se declara el arreglo con sintaxis simplificada
        //2-. Se crea el ciclo for, en el que el contador i inicializa en 0,
        //mientras la condicion (i es menor a la longitud de valores de los elementos arreglo),
        //el valor de i incrementara en 1
        //3-. Y mientras se cumpla la condición, se ejecutara la impresion del
        //valor del indice junto con el valor del elemento del arreglo que corresponda a la posicion del indice

        var numerosEnterosIteracion = new int[] {100, 200, 300, 400, 500};
        for (var i= 0; i< numerosEnterosIteracion.length; i++){
            System.out.println("Valor del indice "+ i + "=" + numerosEnterosIteracion[i]);
        }



        /*Ejercicio para que el usuario introduce valores a un arreglo:
        1-. Se importa la clase scanner
        2-. Se declara la clase consola o scanner para poder leer los valores del usuario
        3-. Se declara la variable largoDelArreglo para que usuario determine cantidad de valores del arreglo
        4-. Se declara de manera dinamica el arregloEnteros
        5-. Se crea un ciclo For para iterar cada uno de los indices del arreglo inicializando
        la variable i en cero para que coincida con el valor del indice 0 y se recorra la cantidad de
        elementos del arreglo mientras se satisface la codicion de i es menor que el largo del arreglo.
        El ciclo imprimira el valor de i asi como leera el valor del elemento del arreglo que corresponde a i que
        le dara el usuario, transformandolo en entero, todo esto mientras se cumpla la condicion de for
        6-. Por ultimo, se crea un ciclo for para imprimir los valores del arreglo


         */

        var consola = new Scanner(System.in);
        System.out.println("Indica cantidad de valores de tu arreglo: ");
        var largoDelArreglo = Integer.parseInt(consola.nextLine());
        var arregloEnteros = new int[largoDelArreglo];
        for(var e=0; e<largoDelArreglo; e++){
            System.out.println("Proporciona el valor del elemento " + e +" del arreglo: ");
            arregloEnteros[e] = Integer.parseInt(consola.nextLine());
        }
        System.out.println("Los valores que proporcionaste son los siguientes");
        for(var r=0; r<largoDelArreglo; r++){
            System.out.println("Valor del indice ["+ r + "]" + "=" + arregloEnteros[r]);
        }




    }
}
