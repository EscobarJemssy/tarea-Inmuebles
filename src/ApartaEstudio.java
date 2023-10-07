public class ApartaEstudio extends Apartamento {
    private double valor_area = 1500000;
    public ApartaEstudio(int num_baños, int num_habitaciones, int id_inmobiliario, int area,
            String direccion) {
        super(num_baños, num_habitaciones, id_inmobiliario, area, direccion);
    }

    public void Imprimir() {
        System.out.println("\n--APARTA ESTUDIO--\n");
        super.Imprimir();
        double precio_venta = super.CalculoPrecioVenta(valor_area);
        System.out.println("Precio venta: "+ precio_venta);
        System.out.println("Valor área:" + valor_area);
    }
}