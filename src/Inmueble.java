public class Inmueble {
    protected int id_inmobiliario;
    protected int area;
    protected String direccion;
    protected double precio_venta; 


    public Inmueble(int id_inmobiliario, int area, String direccion) {
        this.id_inmobiliario = id_inmobiliario;
        this.area = area;
        this.direccion = direccion;
    }

    public double CalculoPrecioVenta(double valor_area) {
        precio_venta = area * valor_area;
        return precio_venta;
    }

    public void Imprimir() {
        System.out.println("id:" + id_inmobiliario);
        System.out.println("El área es:" + area + " " +"m2");
        System.out.println("Dirección:" + direccion);
    }
}
