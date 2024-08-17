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

        //Se crea objeto de tipo Orden, se agregan los productos que se crearon arriba
        var orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        //A continuacion, se llama el metodo de mostrar orden
        orden1.mostrarOrden();

        //Segunda orden
        var orden2 = new Orden();
        orden2.agregarProducto(producto1);
        //Agregamos un producto pero no incluido en el catalog, instanciandolo dentro del metodo agregar producto,
        // gracias al constructor creado para Producto. Este nuevo objeto no se puede reutilizar, solo los instanciados
        //anteriormente
        orden2.agregarProducto(new Producto("Special Edition", 799));
        orden2.agregarProducto(producto2);
        orden2.mostrarOrden();





    }
}
