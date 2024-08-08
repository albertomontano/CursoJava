import java.util.Scanner;

public class PracticaTienda {
    public static void main(String[] args) {

        var precioCelular = 3000;
        var precioTelevision= 3000;
        var claveCtaTiendaUsuario="adminpasstienda123";
        var claveCtaBBVA="adminpass123";
        var saldoBBVA=5800;
        var scanner = new Scanner(System.in); //Aqui creamos el objeto tipo Scanner

        System.out.println("***Bienvenido a tu tienda en linea***");
        System.out.println("Por favor digita tu edad");
        var edadUsuario= scanner.nextLine(); // Creamos la variable de la edad usuario que va a tomar el valor que el usuario digite
        System.out.println("Gracias, tu edad es " + edadUsuario);


        try {
            int edad = Integer.parseInt(edadUsuario);
            if (edad >= 18) {
                System.out.println("El usuario es mayo de edad y puede pasar a la tienda");
                System.out.println("Digita la clave de tu cuenta de la tienda");
                var claveCtaTiendaIngresada= scanner.nextLine();
                if (claveCtaTiendaIngresada.equals(claveCtaTiendaUsuario)) {
                    System.out.println("Bienvenido a tu cuenta de la tienda ");
                    System.out.println("*** Escoge tu departamento***");
                    System.out.println("Computadoras: 1");
                    System.out.println("Televisiones: 2");
                    System.out.println("Celulares: 3");
                    var departamento= scanner.nextLine();
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



                }
                else {
                    System.out.println("contrasena incorrecta");
                }






            } else {
                System.out.println("Lo sentimos, no tienes edad para comprar aqui");
            }

        } catch (NumberFormatException e) {
            System.out.println("El formato de edad no es valido");

        }
    }
}
