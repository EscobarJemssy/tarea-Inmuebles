public class Casa extends InmuebleVivienda {
    private int num_pisos;

    public Casa(int num_pisos, int num_baños, int num_habitaciones, int id_inmobiliario, int area, String direccion) {
        super(num_baños, num_habitaciones, id_inmobiliario, area, direccion);
        this.num_pisos = num_pisos;
    }
    
    public void Imprimir() {
        super.Imprimir();
        System.out.println("Número de pisos:" + num_pisos);
    }

}