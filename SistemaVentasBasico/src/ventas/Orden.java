package ventas;

public class Orden {
    private final int idOrden;
    private Producto[] productos;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 100;
    private static int contadorOrdenes;

    //Constructor de Orden
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[MAX_PRODUCTOS];
    }

    //Metodo agregarProducto
    public void agregarProducto(Producto producto) {
        if(this.contadorProductos < Orden.MAX_PRODUCTOS)
            this.productos[this.contadorProductos++] = producto;
        else
            System.out.println("Se ha superado el maximo de productos" + Orden.MAX_PRODUCTOS);


    }

    //Metodo calcularTotal
    public double calcularTotal() {
        double total = 0;
        for(var i = 0; i< this.contadorProductos; i++) {
            var producto = this.productos[i];
            total += producto.getPrecio(); //Esto es igual a la sintaxis de: Total = total + producto.getPrecio()
        }
        return total;

    }



    //Metodo mostrar numero de orden
    public void mostrarOrden(){
        System.out.println("Id Orden: " + this.idOrden);
        var totalOrden = this.calcularTotal();
        System.out.println("\tTotal Orden: $" + totalOrden);
        System.out.println("\t Productos de la Orden: ");
        for(var i = 0; i< this.contadorProductos; i++) {
            System.out.println("\t\t" + this.productos[i]);
        }

    }







}
