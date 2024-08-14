package ventas;

public class EjecucionVentas {
    public static void main(String[] args){
        System.out.println("***Bienvenido al sistema de ventas***");

        //Se instancia un producto
        var producto1 = new Producto("Reposado", 299);
        System.out.println(producto1);
        //Se instancia segundo producto
        var producto2 = new Producto("Platinum", 399);
        System.out.println(producto2);
        //Se instancia tercer producto
        var producto3 = new Producto("Premium", 599);
        System.out.println(producto3);





    }
}
