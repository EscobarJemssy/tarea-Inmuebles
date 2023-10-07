public class Oficina extends Local {
    private double valor_area = 3500000;
    private boolean esGobierno;

    public Oficina(boolean esGobierno, int tipoLocal, int id_inmobiliario, int area,
            String direccion) {
        super(tipoLocal, id_inmobiliario, area, direccion);
        this.esGobierno = esGobierno;
    }
    
    public void Imprimir() {
        System.out.println("\n--OFICINA--\n");
        super.Imprimir();
        double precio_venta = super.CalculoPrecioVenta(valor_area);
        System.out.println("Precio venta:" + precio_venta);
        System.out.println("Valor de la Area: " + valor_area);
        if (esGobierno) {
            System.out.println("Es del gobierno");
        }
        else {
            System.out.println("No es del gobierno");
        }
            
    }
}