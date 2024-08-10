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


    }
}
