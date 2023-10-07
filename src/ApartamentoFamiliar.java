public class ApartamentoFamiliar extends Apartamento {
    private double valor_area = 2000000;
    private double valor_admin;

    public ApartamentoFamiliar(double valor_admin, int num_baños, int num_habitaciones,
            int id_inmobiliario, int area, String direccion) {
        super(num_baños, num_habitaciones, id_inmobiliario, area, direccion);
        this.valor_admin = valor_admin;
    }

    public void Imprimir() {
        System.out.println("\n--APARTAMENTO FAMILIAR--\n");
        super.Imprimir();
        double precio_venta = super.CalculoPrecioVenta(valor_area); 
        System.out.println("Precio venta:" + precio_venta);
        System.out.println("Valor área:" + valor_area);
        System.out.println("Valor adminisrador" + valor_admin);
    }
}