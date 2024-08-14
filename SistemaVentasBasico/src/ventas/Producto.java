package ventas;

public class Producto {
    //se agrega el atributo idProducto el cual es final debido a que una vez se define el valor, no cambia
    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    //A continuacion se agrega el constructor de Producto.
    //Recordar que los constructores no regresan datos (no return) y se deben de llamar igual que la clase
    public Producto(String nombre, double precio){
        this.idProducto = ++Producto.contadorProductos;
        this.nombre = nombre;
        this.precio = precio;

    }

    //NO se crea metodo set para ID producto ya que este se genera en el constructor anterior
    //Metodo get para ID producto
    public int getIdProducto() {
        return this.idProducto;
    }
    //Metodo get para nombre
    public String getNombre() {
        return this.nombre;
    }
    //Metodo set para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Metodo get para precio
    public double getPrecio() {
        return this.precio;
    }
    //Metodo set para precio
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Se genera metodo toString para obtener los valores del objeto
    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + this.idProducto + ", nombre=" + this.nombre + ", precio=" + this.precio + '}';
    }



}
