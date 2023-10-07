public class LocalComercial extends Local {
    private double valor_area = 3000000;
    private String centro_comercial;

    public LocalComercial(String centro_comercial, int tipoLocal,int id_inmobiliario, int area, String direccion) {
        super(tipoLocal,id_inmobiliario, area, direccion);
        this.centro_comercial = centro_comercial;
    }

    public void Imprimir() {
        System.out.println("\n--LOCAL COMERCIAL--\n");
        super.Imprimir();
        double precio_venta = super.CalculoPrecioVenta(valor_area);
        System.out.println("Precio venta:" + precio_venta);
        System.out.println("Valor Area: " + valor_area);
        System.out.println("Centro comercial: " + centro_comercial);
    }
}