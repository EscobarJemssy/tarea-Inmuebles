public class CasaRural extends Casa {
    private double valor_area = 1500000;
    private double distancia_cabecera;
    private double altitud;

    public CasaRural(int distancia_cabecera, int altitud,int num_pisos, int num_baños,
            int num_habitaciones, int id_inmobiliario, int area, String direccion) {
        super(num_pisos, num_baños, num_habitaciones, id_inmobiliario, area, direccion);
        this.distancia_cabecera = distancia_cabecera;
        this.altitud = altitud;
    }

    public void Imprimir() {
        System.out.println("\n--CASA RURAL--\n");
        super.Imprimir();
        double precioventa = super.CalculoPrecioVenta(valor_area);
        System.out.println("Precio venta:" + precioventa);
        System.out.println("Valor área:" + valor_area);
        System.out.println("Distancia cabecera:" + distancia_cabecera + "m");
        System.out.println("Altitud:" + altitud + "SNM");
    }
}