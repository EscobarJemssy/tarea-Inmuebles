public class CasaConjuntoCerrado extends CasaUrbana {
    private double valor_admin;
    private double valor_area= 2500000;
    private boolean tiene_piscina;
    private boolean tiene_campoDeportivo;

    public CasaConjuntoCerrado(double valor_admin, boolean tiene_piscina,
            boolean tiene_campoDeportivo, int num_pisos, int num_baños,
            int num_habitaciones, int id_inmobiliario, int area, String direccion) {
        super(num_pisos, num_baños, num_habitaciones, id_inmobiliario, area, direccion);
        this.valor_admin = valor_admin;
        this.tiene_piscina = tiene_piscina;
        this.tiene_campoDeportivo = tiene_campoDeportivo;
    }

    public void Imprimir() {
        System.out.println("\n--CASA CONJUNTO CERRADO--\n");
        super.Imprimir();
        double precioventa = super.CalculoPrecioVenta(valor_area);
        System.out.println("Precio venta:" + precioventa);
        System.out.println("Valor área:" + valor_area);
        System.out.println("Valor administrador:" + valor_admin);
        if (tiene_piscina) {
            System.out.println("Tiene piscina");
        }
        else {
            System.out.println("No tiene piscina");
        }

        if (tiene_campoDeportivo) {
            System.out.println("Tiene campo deportivo");
        }
        else {
            System.out.println("No tiene campo deportivo");
        }
        
    }
}