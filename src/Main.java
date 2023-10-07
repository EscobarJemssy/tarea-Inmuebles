public class Main {
    public static void main(String[] args) {
        CasaRural casaRural = new CasaRural(5, 5, 3, 3, 3, 3, 2, "Cra 15 #02");
        casaRural.Imprimir();
        
        CasaConjuntoCerrado casaConjCerrado = new CasaConjuntoCerrado(1200000, false, true, 4, 4, 6, 4, 3, "Cra 28 #7");
        casaConjCerrado.Imprimir();

        CasaIndependiente casaindep = new CasaIndependiente(2, 2, 3, 5, 3, "Calle 75 #06");
        casaindep.Imprimir();

        ApartamentoFamiliar apartFamiliar = new ApartamentoFamiliar(145000000, 10, 10, 6, 4, "Cra 80 #6");
        apartFamiliar.Imprimir();

        ApartaEstudio apartEstudio = new ApartaEstudio(3, 3, 7, 2, "Calle 5 #07");
        apartEstudio.Imprimir();

        LocalComercial localComercial = new LocalComercial("Centro Gojo", 1, 8, 5, "Cra 76 #2");
        localComercial.Imprimir();

        Oficina oficina = new Oficina(true, 1, 9, 6, "Calle 45");
        oficina.Imprimir();
    }
    
}
