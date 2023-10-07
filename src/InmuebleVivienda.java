public class InmuebleVivienda extends Inmueble {
    private int num_habitaciones;
    private int num_baños;

    public InmuebleVivienda(int num_habitaciones, int num_baños, int id_inmobiliario, int area, String direccion) {
        super(id_inmobiliario, area, direccion);
        this.num_baños = num_baños;
        this.num_habitaciones = num_habitaciones;
    }

    public void Imprimir() {
        super.Imprimir();
        System.out.println("Número de baños:"+ num_baños);
        System.out.println("Número de habitaciones:" + num_habitaciones);
    }
}