package GPS;

public class RutaEconomica implements RutaStrategy{
    @Override
    public String calcularRuta(String puntoA, String puntoB) {
        return "Ruta más economica entre " + puntoA + " y " + puntoB;
    }
}
