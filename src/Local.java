public class Local extends Inmueble {
    private int tipoLocal;

    public Local(int tipoLocal, int id_inmobiliario, int area, String direccion) {
        super(id_inmobiliario, area, direccion);
        this.tipoLocal = tipoLocal;
    }

    public void TipoLocal(int tipoLocal) {
        if (tipoLocal == 1) {
            System.out.println("Tipo de local: Interno");
        } else if (tipoLocal == 2) {
            System.out.println("Tipo de local: Calle");
        } else {
            System.out.println("Tipo de local no reconocible. ");
        }

    }

    public void Imprimir() {
        super.Imprimir();
        TipoLocal(tipoLocal);
    }
}