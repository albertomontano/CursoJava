public class Cadenas {

    /* A continuacion esta la representacion de un ejemplo de inmutabilidad de cadenas
    podemos observar que creamos una cadena, luego creamos una segunda cadena la cual su
    valor es cadena1, sin embargo, posteriormente cadena1 es modificado. Al imprimir ambas
    cadenas, observamos que cadena2 imprime el primer mensaje, esto es porque se hace aun
    referencia al objeto creado en la primer cadena, aunque este fue modificado, no es eliminado
    de memoria (el garbage collector no lo eliminara mientras cadena2 lo use)
    */
    public static void main (String[] args) {
        var cadena1 = "Primer mensaje";
        var cadena2 = cadena1;
        cadena1 = "Mensaje modificado";

        System.out.println(cadena1 + "\n" + cadena2);


    }
}
