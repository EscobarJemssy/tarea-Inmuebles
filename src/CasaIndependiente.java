public class CasaIndependiente extends CasaUrbana {
    private double valor_area = 3000000;
    public CasaIndependiente(int num_pisos, int num_baños,
            int num_habitaciones, int id_inmobiliario, int area, String direccion) {
        super(num_pisos, num_baños, num_habitaciones, id_inmobiliario, area, direccion);
    }

    public void Imprimir() {
        System.out.println("\n--CASA INDEPENDIENTE--\n");
        super.Imprimir();
        double precio_venta = super.CalculoPrecioVenta(valor_area);
        System.out.println("Precio venta: "+ precio_venta);
        System.out.println("Valor área:" + valor_area);
    }
}
