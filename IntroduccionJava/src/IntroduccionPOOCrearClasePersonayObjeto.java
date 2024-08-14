public class IntroduccionPOOCrearClasePersonayObjeto {
    String nombre;
    String apellido;

    void mostrarNombreCompletoPersona(){
        System.out.println("El nombre del persona es: "+nombre);
        System.out.println("El apellido del persona es: "+apellido);
    }

    public static void main(String[] args) {
        System.out.println("*** Creacion de Clase y Objeto Persona ***");
        var objetoPersona1 = new IntroduccionPOOCrearClasePersonayObjeto();
        objetoPersona1.nombre = "Venustiano";
        objetoPersona1.apellido = "Carranza";
        objetoPersona1.mostrarNombreCompletoPersona();
        objetoPersona1.nombre= "Cambio de nombre";
        objetoPersona1.apellido= "Cambio de apellido";
        objetoPersona1.mostrarNombreCompletoPersona();

        // Nuevo objeto
        var objetoPersona2 = new IntroduccionPOOCrearClasePersonayObjeto();
        objetoPersona2.nombre = "Cecilia";
        objetoPersona2.apellido = "Alvarez";
        objetoPersona2.mostrarNombreCompletoPersona();
    }


}
