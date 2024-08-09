import java.util.Scanner;
import java.io.Console;

public class PracticaTienda {
    public static void main(String[] args) {

        var precioCelular = 3000;
        var precioTelevision= 3000;
        var claveCtaTiendaUsuario="adminpasstienda123";
        var claveCtaBBVA="adminpass123";
        var saldoBBVA=5800;
        var scanner = new Scanner(System.in); //Aqui creamos el objeto tipo Scanner

        System.out.println("***Bienvenido a tu tienda en linea***");

        //A continuacion, se inicia el ciclo while iniciando edad con 0 para que el codigo se ejecute una vez, mientras la edad del
        //usuario sea menor a 18, el sistema estara preguntando siempre la edad

        int edad = 0;
        while (edad<18) {

            System.out.println("Por favor digita tu edad");
            var edadUsuario = scanner.nextLine(); // Creamos la variable de la edad usuario que va a tomar el valor que el usuario digite
            System.out.println("Gracias, tu edad es " + edadUsuario);


            try {
                edad = Integer.parseInt(edadUsuario);
                if (edad >= 18) {
                    System.out.println("El usuario es mayor de edad y puede pasar a la tienda");

                    //Se obtiene la instance de Console
                    Console console = System.console();
                    if (console == null) {
                        System.out.println("No se puede obtener la consola");
                        return;
                    }


                    //A continuacion, ciclo para clave, mientras sea clave incorrecta, el usuario volvera a tener que ingresar la clave
                    String claveCtaTiendaIngresada ="";
                    while(!claveCtaTiendaIngresada.equals(claveCtaTiendaUsuario)) {
                        System.out.println("Digita la clave de tu cuenta de la tienda");
                        char[] passwordArray = console.readPassword();
                        claveCtaTiendaIngresada = new String(passwordArray);
                        if (!claveCtaTiendaIngresada.equals(claveCtaTiendaUsuario)) {
                            System.out.println("contrasena incorrecta");
                        }
                    } //Finaliza ciclo para clave ingresada

                    System.out.println("Bienvenido a tu cuenta de la tienda ");
                    System.out.println("*** Escoge tu departamento***");
                    System.out.println("Computadoras: 1");
                    System.out.println("Televisiones: 2");
                    System.out.println("Celulares: 3");
                    var departamento = scanner.nextLine();
                    switch (departamento) {
                            case "1":
                                System.out.println("***Bienvenido al dpto Computadoras");
                                break;
                            case "2":
                                System.out.println("***Bienvenido al dpto Televisiones");
                                break;
                            case "3":
                                System.out.println("***Bienvenido al dpto Celulares");
                                break;
                            default:
                                System.out.println("Departamento invalido");
                    }


                } else {
                    System.out.println("Lo sentimos, no tienes edad para comprar aqui");
                }

            } catch (NumberFormatException e) {
                System.out.println("El formato de edad no es valido");

            }
        } //Cierre de ciclo de edad
    }
}
